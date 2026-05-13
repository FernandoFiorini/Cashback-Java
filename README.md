# 💰 Cashback Java API

A simple backend project built in **Java** for managing a **cashback system**, including ticket processing, campaign management, and cashback distribution tracking.

This project uses **PostgreSQL** as its primary database.

---

## 🚀 Features

* Process purchase tickets and automatically apply cashback rules
* Create and manage multiple active cashback campaigns
* Track total cashback distributed across all users
* Retrieve users with available cashback balances

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* PostgreSQL
* JPA / Hibernate

---

## 📦 Endpoints

### 📌 `POST /processTicket`

Processes a purchase ticket.

**What it does:**

* Saves the ticket into the database
* Checks for active cashback campaigns
* Applies cashback rules
* Distributes or consumes cashback based on the purchase

---

### 📌 `POST /saveCampaign`

Creates or updates a cashback campaign.

**Important:**

* The system supports **multiple active campaigns at the same time**

---

### 📌 `GET /getTotalCashbackDistribution`

Returns the total amount of cashback distributed so far across all users.

---

### 📌 `GET /getCashbackDistribution`

Returns a list of all users who currently have cashback available.

---

## 🗄️ Database

This project uses **PostgreSQL** for data persistence.

You can configure your database connection in:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database
spring.datasource.username=your_user
spring.datasource.password=your_password
```

---

## ▶️ Running the Project

1. Clone the repository:

```bash
git clone https://github.com/your-username/your-repo.git
```

2. Navigate to the project folder:

```bash
cd your-repo
```

3. Run the application:

```bash
./mvnw spring-boot:run
```

or

```bash
mvn spring-boot:run
```

---

## 📄 Notes

* Cashback calculation is based on active campaign rules
* Multiple campaigns can affect the same transaction
* Ensure PostgreSQL is running before starting the application

---

## 📌 Future Improvements (suggestions)

* Campaign prioritization rules
* Cashback expiration policies
* Global error treatment

