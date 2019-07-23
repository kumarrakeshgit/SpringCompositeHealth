# SpringCompositeHealth
Monitoring micro


Need to scope and benefit with POC documentation
Grafana
Prometheus



=====Exact Requirement for Monitoring ====================================
Monitoring for Microservices based application as it is way different from monolithic application
docker container based monitoring

==Current monitoring of Monolothic application=======================

Geneos Monitoring Tool: currently used

Current Monitoring System(on both servers):
1. Checking host server availability. It configured to hit the ../basal/ url to check if the server is available or not.
2. Geneos is configured to check the if application server(jboss) is running. it uses process id filter to check this process.
3. Geneous check if the application is up and running. it uses curl command to hit the url and based on the response code it decides.
4. Application monitoring using logs. It check specific word in webapp.log and service.log file to check if the application auto resated. It is configured to look for work [started *....].
5. Performance monitoring using gc.log file filtring. Configured to filter the specific word [fullgc] in the gc.log file if the occurance is more than 15 it alerts.
6. Database monitoring is cofigured by hitting some query and received response.

Features:
 Alerting 
 Provide host server status
 Provide application server status
 Provide application status using curl
 log monitoring/filtring
 Database monitoring
 
 
 Lacking:
 Graphical interface
 latency issue
 CPU and Memory utilization
 
 
 Need for Microservices based architecture:
 ==========================================
 bad deployments
 lack of proper monitoring
 
 four components for monitoring
 1.Logging:proper logging with all relevent and important information
 2.Dashboard:well-designed dashboard that accurately reflect the health
 3.Alerting:actionable and effective alerting
 4.on-call rotation for monitoring
 
 Monitoring Essentials
 =======================
 1.Microservices key matrics.
 2.Infrastrecture/host key matrics
 3.Mocroservices level matrics
 4.Mocroservices level matrics monitoring
 
 ==============================confluence document for Microservices monitoring======
 this should including all level of monitoring like infra/system level monitoring like
 cpu
 ram
 
 
 
 Tracing and debug
 sluth
 zipkin
 ===============================================================================
 AppDynamics Microservice monitiring

AppDynamics started providing visibility into microservices in the summer 2016 release of its namesake monitoring service. A new Microservices iQ module in the AppDynamics cloud service automatically monitors all the endpoints that make up a particular microservices. Once detected, IT operations teams  then can track the number of calls per minute being made to that service, the average response times and errors made per minute. IT operations teams also can create snapshots to gather more detailed diagnostics when trying to identify performance issues affecting a specific microservice. Below are some microservices monitoring features by AppDynamics.

Track microservices deployed in elastic infrastructure:

	Efficiently track microservices deployed in elastic infrastructure such as containers or cloud where nodes scale up and down very rapidly.
	Retain historical data about the microservice and infrastructure nodes and correlate it with past and future instances of the microservice

Correlate your application, container, and underlying host metrics
	Automatic discovery of entry and exit points of your microservice as service endpoints for focused microservices monitoring
	Track the key performance indicators of your microservice without worrying about the entire distributed business transaction that uses it
	Drill down and isolate the root cause of any performance issues affecting the microservice

Maximize your development velocity with Docker container and microservice monitoring
	Fully automated Docker monitoring
		Integrate Docker monitoring as part of your CI/CD process to speed up continuous delivery
		Adhere to security best practices by running monitoring containers in the least privileged mode
	Full-stack visibility to optimize application performance
		Quickly triage performance issues and avoid alert storms by automatically identifying root cause
		Understand every metric, every event on Docker hosts, all monitored containers, and applications — with line of code-level granularity.
	Modernize traditional applications with confidence	
		Be confident in the performance monitoring of every microservice, no matter the architecture, complexity, or scale
		Run Docker containers on any cloud, including AWS, Azure, GCP, or on-premises private cloud with any orchestrator, such as Kubernetes, Docker Swarm, or Mesos
	Drive business value
		Proactively manage risk and prove business value with every code release
	for more details refer https://www.appdynamics.com/docker/	
		

Heat Maps provide rapid performance monitoring & outlier detection
	Visualize your container infrastructure across a clustered view of containers and hosts over time
	Visually correlate metrics of containers vs metrics of hosts across a time series
	Visually spot patterns in performance outliers behavior across time for rapid diagnostics and resolution	

Check availability of microservices deployed within your network or externally
	Check availability and basic performance metrics for HTTP based microservices that are not monitored by an AppDynamics agent
	Alert based on custom validation of HTTP response
	
for more details refer https://www.appdynamics.com/solutions/microservices/
and
https://www.appdynamics.com/blog/news/visualizing-and-tracking-your-microservices/

=============================================================================================================================
Dynatrace Monitoring Tool

Automatic discovery: In just a few minutes, with no manual configuration, Dynatrace auto-discovers all the components and dependencies of your entire technology stack end-to-end.
Automatic performance baselining: We baseline to automatically learn what constitutes normal performance, with no manual configuration.
Automatic business impact: We provide an automated assessment of the business impact of a problem, so you can easily prioritize your efforts.
Automatic root cause analysis: We use artificial intelligence to automatically identify performance issues before customers are impacted.
artificial intelligence engine: It gives you causation, not correlation. While a single problem may result in a sea of alerts, Dynatrace is smart enough to understand that these alerts are all related.
automatically detect all containers and microservices: with a single agent, without modifying images or manual configuration.
not only container health, but more importantly the health of the software and services running inside your containers.
artificial intelligence engine automatically detects problems and their root cause, which is critical in a complex, dynamic microservice environment.
Dynatrace provides network visibility, which is essential in a highly distributed environment that leverages containers.
For more details: https://www.dynatrace.com/news/blog/top-5-reasons-cant-compare-appdynamics-dynatrace-apm/
===========================================
AppDynamics Microservice monitiring

AppDynamics provides various features to monitor microservices deployed on cloud infrastracture. It also provide docker container monitoring. Some of the feature are listed below:

Docker container and microservice monitoring
Track microservices deployed in elastic infrastructure
provide rapid performance monitoring & outlier detection
Check availability of microservices deployed within your network or externally
for more details refer https://www.appdynamics.com/solutions/microservices/ and https://www.appdynamics.com/blog/news/visualizing-and-tracking-your-microservices

