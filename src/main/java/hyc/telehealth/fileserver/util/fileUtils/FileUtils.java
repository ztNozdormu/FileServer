package hyc.telehealth.fileserver.util.fileUtils;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	/**
	 * 文件处理工具类
	 * @author DELL
	 *
	 */
public class FileUtils {
    
				/**
				 * 把获得的文件转换成byte[]型然后存入数据库中。关于fle类型到byte[]型的转换
				 * @param file
				 * @return
				 */
		        public static byte[] fileToBytes(File file){  
		        	
				        byte[] buffer = null;
				        if (file == null){
				            return buffer;
				        } else {             
				            try {     
				                FileInputStream fis = new FileInputStream(file);  
				                ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);  
				                byte[] b = new byte[1000];  
				                int n;  
				                while ((n = fis.read(b)) != -1) {  
				                    bos.write(b, 0, n);  
				                }  
				                fis.close();  
				                bos.close();  
				                buffer = bos.toByteArray();  
				            } catch (FileNotFoundException e) {  
				                e.printStackTrace();  
				            } catch (IOException e) {  
				                e.printStackTrace();  
				            }
				            
				        }
				          
				         return buffer;  
		           }   
		        
		        /**
		         * 从数据库中取出该图片的byte[]，之后转换成File类型的文件并保存到一个相对路径下的临时文件夹里面
		         * 将数据库存的Blob类型的转换后的一个文件,保存到本地临时文件中
		         * @param buf
		         * @param filePath
		         * @param fileName
		         */
		        public static void byteToFile(byte[] buf, String filePath, String fileName){  
		        	
			            BufferedOutputStream bufferOut = null;  
			            FileOutputStream fileOut = null;  
			            File file = null;  
			            try  
			            {  
			                File resFile = new File(filePath);  
			                if (!resFile.exists() && resFile.isDirectory())  
			                {  
			                    resFile.mkdirs();  
			                }  
			                file = new File(filePath + File.separator + fileName);  
			                fileOut = new FileOutputStream(file);  
			                bufferOut = new BufferedOutputStream(fileOut);  
			                bufferOut.write(buf);  
			            }  
			            catch (Exception e)  
			            {  
			                e.printStackTrace();  
			            }  
			            finally  
			            {  
			                if (bufferOut != null)  
			                {  
			                    try  
			                    {  
			                        bufferOut.close();  
			                    }  
			                    catch (IOException e)  
			                    {  
			                        e.printStackTrace();  
			                    }  
			                }  
			                if (fileOut != null)  
			                {  
			                    try  
			                    {  
			                        fileOut.close();  
			                    }  
			                    catch (IOException e)  
			                    {  
			                        e.printStackTrace();  
			                    }  
			                }  
			            }          
			            
		        } 
		        
		        
		        /**
		         * 将接收的字符串转换成图片保存
		         * 
		         * @param imgStr
		         *            二进制流转换的字符串
		         * @param imgPath
		         *            图片的保存路径
		         * @param imgName
		         *            图片的名称
		         * @return 1：保存正常 0：保存失败
		         */
		        public static int saveToImgByStr(String imgStr, String imgPath, String imgName) {
		        try {
		        System.out.println("===imgStr.length()====>" + imgStr.length() + "=====imgStr=====>" + imgStr);
		        } catch (Exception e) {
		        e.printStackTrace();
		        }
		        int stateInt = 1;
		        if (imgStr != null && imgStr.length() > 0) {
		        try {
		        // 将字符串转换成二进制，用于显示图片
		        // 将上面生成的图片格式字符串 imgStr，还原成图片显示
		        byte[] imgByte = hex2byte(imgStr);
		        System.out.println(imgByte);
		        InputStream in = new ByteArrayInputStream(imgByte);
		        File file = new File(imgPath, imgName);// 可以是任何图片格式.jpg,.png等
		        FileOutputStream fos = new FileOutputStream(file);
		        byte[] b = new byte[1024];
		        int nRead = 0;
		        while ((nRead = in.read(b)) != -1) {
		        fos.write(b, 0, nRead);
		        }
		        fos.flush();
		        fos.close();
		        in.close();
		        } catch (Exception e) {
		        stateInt = 0;
		        e.printStackTrace();
		        } finally {
		        }
		        }
		        return stateInt;
		        
		        }

		        /**
		         * 将二进制转换成图片保存
		         * 将图片转换成二进制保存
		         * @param imgStr
		         *            二进制流转换的字符串
		         * @param imgPath
		         *            图片的保存路径
		         * @param imgName
		         *            图片的名称
		         * @return 1：保存正常 0：保存失败
		         */
//		        public static int saveToImgByBytes(File imgFile, String imgPath, String imgName) {
//			        int stateInt = 1;
//			        if (imgFile.length() > 0) {
//			        try {
//			        File file = new File(imgPath, imgName);// 可以是任何图片格式.jpg,.png等
//			        FileOutputStream fos = new FileOutputStream(file);
//			        FileInputStream fis = new FileInputStream(imgFile);
//			        byte[] b = new byte[1024];
//			        int nRead = 0;
//			        while ((nRead = fis.read(b)) != -1) {
//			        fos.write(b, 0, nRead);
//			        }
//			        fos.flush();
//			        fos.close();
//			        fis.close();
//			        } catch (Exception e) {
//			        stateInt = 0;
//			        e.printStackTrace();
//			        } finally {
//			        }
//			        }
//			        return stateInt;
//		        }
		        
		        /**
		         * 字符串转二进制
		         * 
		         * @param str
		         *            要转换的字符串
		         * @return 转换后的二进制数组
		         */
		        public static byte[] hex2byte(String str) { // 字符串转二进制
		           if (str == null) {
		                return null;
		           }
		               str = str.trim();
				        int len = str.length();
				         if (len == 0 || len % 2 == 1) {
				             return null;
				         }
				        byte[] b = new byte[len / 2];
				        try {
				        for (int i = 0; i < str.length(); i += 2) {
				            b[i / 2] = (byte) Integer.decode("0X" + str.substring(i, i + 2)).intValue();
				        }
				        return b;
				        } catch (Exception e) {
				        	
				        }
				        return null;
		        }
		        
		        public static String toHexString(byte[] byteArray) {
		        	  if (byteArray == null || byteArray.length < 1)
		        	   throw new IllegalArgumentException("this byteArray must not be null or empty");
		        	 
		        	  final StringBuilder hexString = new StringBuilder();
		        	  for (int i = 0; i < byteArray.length; i++) {
		        	   if ((byteArray[i] & 0xff) < 0x10)//0~F前面不零
		        	    hexString.append("0");
		        	   hexString.append(Integer.toHexString(0xFF & byteArray[i]));
		        	  }
		        	  return hexString.toString().toLowerCase();
		        	 }
		        
		        /** 
		         * 获取图片 
		         * @param request 
		         * @param response 
		         */  
		        public void GetImage(HttpServletRequest request    
		                , HttpServletResponse response){  
		            try {    
		                   URL url = new URL("http://218.6.160.10:8090/xtRmcService/doctorPhotoSmall.do?doctorId=292");    
		                   HttpURLConnection conn = (HttpURLConnection)url.openConnection();    
		                   conn.setRequestMethod("GET");    
		                   conn.setConnectTimeout(5 * 1000);    
		                   InputStream inStream = conn.getInputStream();//通过输入流获取图片数据    
		                byte data[] = readInputStream(inStream);  
		                inStream.read(data);  //读数据     
		                inStream.close();     
		                response.setContentType("image/jpg"); //设置返回的文件类型     
		                OutputStream os = response.getOutputStream();    
		                os.write(data);    
		                os.flush();    
		                os.close();   
		               } catch (Exception e) {    
		                   e.printStackTrace();    
		               }   
		        }  
		          
		          
		         public static byte[] readInputStream(InputStream inStream) throws Exception{    
		                ByteArrayOutputStream outStream = new ByteArrayOutputStream();    
		                byte[] buffer = new byte[2048];    
		                int len = 0;    
		                while( (len=inStream.read(buffer)) != -1 ){    
		                    outStream.write(buffer, 0, len);    
		                }    
		                inStream.close();    
		                return outStream.toByteArray();    
		         }
		         
		   
}
