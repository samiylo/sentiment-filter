# Sentiment-Filter Microservice

## Overview

The **Sentiment-Filter Microservice** is a Java-based application that uses the **Stanford Sentiment Analyzer** to analyze customer reviews for products. It processes review text and categorizes sentiment into predefined classes (e.g., Positive, Negative, Neutral). This service is designed to help businesses gain actionable insights into customer feedback.

---

## Features

- Sentiment classification for customer reviews.
- RESTful API to integrate with other services.
- Configurable thresholds for filtering sentiments.
- Logs detailed analytics for feedback trends.

---

## Technologies Used

- **Java 17**
- **Spring Boot**
- **Stanford CoreNLP**
- **Maven** for dependency management
- **OpenShift** (optional, for deployment)
- **PostgreSQL** or any other database (optional, for storing processed reviews)

---

## Setup Instructions

### Prerequisites

1. **Java 17** installed.
2. **Maven** installed.
3. Clone this repository:
   ```bash
   git clone <repository-url>
   cd sentiment-filter-microservice
4. Download the Stanford CoreNLP library and models: