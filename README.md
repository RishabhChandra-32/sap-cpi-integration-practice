# SAP CPI – End-to-End Integration Practice

## Overview
This repository demonstrates end-to-end integration scenarios built using
SAP Integration Suite (Cloud Integration – CPI). The project focuses on
real-world enterprise integration patterns between SAP S/4HANA and
third-party systems.

## Integration Scenario
- Inbound REST API receives business data (Order / Master Data)
- Payload validation and transformation using Message Mapping
- Conditional routing implemented using Groovy scripting
- Data sent to target systems using SFTP / IDoc / OData adapters
- Error handling using exception subprocess
- Monitoring performed using SAP CPI monitoring tools

## Adapters Used
- HTTP Adapter
- SFTP Adapter
- IDoc Adapter
- OData Adapter

## SAP CPI Features Covered
- iFlow design and configuration
- Message Mapping
- Content Modifier
- Groovy scripting (basic routing and conditions)
- Exception handling and retries
- CPI monitoring and troubleshooting
- Secure communication using credentials and certificates

## Sample Use Cases
- SAP S/4HANA to Third-Party Order Integration
- File-based data transfer using SFTP
- API-based inbound and outbound integrations

## Disclaimer
This project is created strictly for learning and demonstration purposes.
No client-specific, confidential, or production data is used.

