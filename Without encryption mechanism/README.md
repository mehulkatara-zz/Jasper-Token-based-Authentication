# Token Based Authentication
**Never use without encryption mechanism for production**


1. Copy below file


    **(For Community Editions Only)**

        applicationContext-externalAuth-preAuth.xml
    **(For Commercial Editions Only)**
    
    rename to 

        applicationContext-externalAuth-preAuth-mt.xml
        
2. Paste this file to 

    **(For Community Editions Only)**

        C:\Jaspersoft\jasperreports-server-cp-6.4.2\apache-tomcat\webapps\jasperserver\WEB-INF
        

#### Token format configuration 
    
* Example for token: 

        pp=u=mehul|exp=201802161800
        
* Encode token when you use in your application 

        localhost:8080/jasperserver?pp=u=mehul%7Cexp=201802161835
   * | replaced by %7C

   - enter valide time for token expiretime formate yyyyMMddHHmm 
        

> **Tested under Community Editions Only**
