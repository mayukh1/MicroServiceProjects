<p>To enable the discovery of the client :&nbsp;</p>
<ul>
<li>Add the gradle entry for eureka discovery service api :&nbsp;&nbsp; &nbsp; compile group: 'org.springframework.cloud', name: 'spring-cloud-starter-netflix-eureka-client', version: '2.0.2.RELEASE'</li>
<li>Add the annotation : @EnableDiscoveryClient in the application context class</li>
<li>Import the import org.springframework.cloud.client.discovery.EnableDiscoveryClient;</li>
<li>Add the below two properties in the application.properties file :&nbsp; &nbsp; <em>eureka.client.service-url.default-zone=</em><strong>http://localhost:8761/eureka</strong>&nbsp; &nbsp; <em>spring.application.name=</em><strong>&lt;application_name&gt; </strong></li>
</ul>
<p>This will display the service details on the Eureka discovery page : <strong>http://localhost:8761/</strong></p>
