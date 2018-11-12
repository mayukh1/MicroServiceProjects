<p>To enable the discovery of the client :&nbsp;</p>
<ul>
<li>Add the gradle entry for eureka discovery service api :<br />compile group: 'org.springframework.cloud', name: 'spring-cloud-starter-netflix-eureka-client', version: '2.0.2.RELEASE'</li>
<li>Add the annotation : <em>@EnableDiscoveryClient</em> in the application context class</li>
<li>Import the <br />import org.springframework.cloud.client.discovery.EnableDiscoveryClient;</li>
<li>Add the below two properties in the application.properties file :<br /><em>eureka.client.service-url.default-zone=</em><strong><a href="http://localhost:8761/eureka">http://localhost:8761/eureka</a></strong><em><br />spring.application.name=</em><strong>&lt;application_name&gt; </strong></li>
</ul>
<p>This will display the service details on the Eureka discovery page : <strong>http://localhost:8761/</strong></p>
