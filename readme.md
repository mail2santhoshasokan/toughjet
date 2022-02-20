To Run the project:

1) Run mssql in docker, use the following command:
   docker run -e "ACCEPT_EULA=Y" -e "SA_PASSWORD=Mercedes@e53" -p 1433:1433 --name mssql -d mcr.microsoft.com/mssql/server:2019-latest

To Create DB & Table please use the following commands:
1) Create DB:
   USE master
   GO
   IF NOT EXISTS (
   SELECT [name]
   FROM sys.databases
   WHERE [name] = N'toughjet'
   )
   CREATE DATABASE toughjet
   GO
2) Create Table:   
   IF OBJECT_ID('[dbo].[FlightSchedule]', 'U') IS NOT NULL
   DROP TABLE [dbo].[FlightSchedule]
   GO
   CREATE TABLE [dbo].[FlightSchedule]
   (
   [Id] INT NOT NULL PRIMARY KEY, -- Primary Key column
   [carrier] NVARCHAR(50) NOT NULL,
   [basePrice] NUMERIC NOT NULL,
   [tax] NUMERIC NOT NULL,
   [discount] NUMERIC NOT NULL,
   [departureAirportName] NVARCHAR(50) NOT NULL,
   [arrivalAirportName] NVARCHAR(50) NOT NULL,
   [outboundDateTime] DATETIME NOT NULL,
   [inboundDateTime] DATETIME NOT NULL
   );
   GO
3) Insert Data:
   INSERT INTO [dbo].[FlightSchedule]
   (
   [Id], [carrier], [basePrice], [tax], [discount], [departureAirportName], [arrivalAirportName], [outboundDateTime], [inboundDateTime]
   )
   VALUES
   (
   2, 'Lufthansa', 1500, 10, 2, 'LHR', 'COK', '2022-02-18 12:00:00.113', '2022-02-19 12:00:00.113'
   )
   GO
   
To Access Swagger documentation:
   http://localhost:8081/swagger-ui/index.html

To Do:
1) Add more test cases
2) validation in fields
3) Logging and MDC
4) HealthCheck