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
 
