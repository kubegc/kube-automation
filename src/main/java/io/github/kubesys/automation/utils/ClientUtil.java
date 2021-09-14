/**
 * Copyrigt (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.kubesys.automation.utils;

import java.util.logging.Logger;
import io.github.kubesys.backend.SQLMapper;


/**
 * @author lichengzhi99@otcaix.iscas.ac.cn
 * @author wuheng@otcaix.iscas.ac.cn
 *
 */
public class ClientUtil {

	public static Logger m_logger = Logger.getLogger(ClientUtil.class.getName());
	
	
   
   protected static SQLMapper sqlMapper = null;
	
	/**
	 * @return                           sqlClient
	 */
	public static synchronized SQLMapper sqlMapper() {
		
		try {
			if (sqlMapper == null) {
				sqlMapper =  new SQLMapper();
			}
		} catch (Exception ex) {
			m_logger.severe(ex.toString());
			System.exit(1);
		}
		
		return sqlMapper;
	}
	
}
