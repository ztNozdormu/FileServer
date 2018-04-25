package hyc.telehealth.fileserver.util.fileUtils;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

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
}
