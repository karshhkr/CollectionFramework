# Java Collections Framework – Structured Guide

This repository provides a **clear, structured, and beginner-to-intermediate friendly explanation** of the **Java Collections Framework (JCF)**.
It is designed for **learning, revision, and interview preparation**, especially for **Java Backend Developers**.

---

## 📌 What is Java Collections Framework?

The **Java Collections Framework (JCF)** is a unified architecture in Java that provides:

* Interfaces
* Implementations (classes)
* Algorithms

It helps in **storing, manipulating, and processing groups of objects efficiently**.

---

## 📦 Core Components of JCF

1. Interfaces
2. Implementing Classes
3. Utility Algorithms (via `Collections` class)

---

## 🧩 Collection Hierarchy (High Level)

```
Iterable
   └── Collection
         ├── List
         ├── Set
         └── Queue

Map (separate hierarchy)
```

---

## 📘 Iterable Interface

### Description

* Root interface of the collection framework
* Enables **iteration using Iterator**

### Key Method

```java
Iterator<T> iterator();
```

### Implemented By

* All collection classes indirectly

---

## 📗 Collection Interface

### Description

* Root interface for **List, Set, and Queue**
* Defines common operations

### Important Methods

* `add()`
* `remove()`
* `size()`
* `contains()`
* `clear()`

---

## 📙 List Interface

### Description

* Maintains **insertion order**
* Allows **duplicate elements**
* Index-based access

### Implementing Classes

#### 1️⃣ ArrayList

* Dynamic array
* Fast random access
* Slow insertion/deletion in middle

#### 2️⃣ LinkedList

* Doubly linked list
* Fast insertion/deletion
* Slower access

#### 3️⃣ Vector

* Thread-safe (synchronized)
* Legacy class

#### 4️⃣ Stack

* LIFO (Last In First Out)
* Legacy class

---

## 📕 Set Interface

### Description

* **No duplicate elements**
* No index-based access

### Implementing Classes

#### 1️⃣ HashSet

* No order guaranteed
* Fast performance

#### 2️⃣ LinkedHashSet

* Maintains insertion order

#### 3️⃣ TreeSet

* Sorted order
* Implements NavigableSet

---

## 📒 Queue Interface

### Description

* Follows **FIFO** principle
* Used for task scheduling

### Important Methods

* `offer()`
* `poll()`
* `peek()`

### Implementing Classes

#### 1️⃣ PriorityQueue

* Elements ordered by priority

#### 2️⃣ ArrayDeque

* Double-ended queue
* Faster than Stack & LinkedList

---

## 📓 Deque Interface

### Description

* Double-ended queue
* Insert and remove from both ends

### Implementing Classes

* ArrayDeque
* LinkedList

---

## 📔 Map Interface (Not part of Collection)

### Description

* Stores data as **key-value pairs**
* Keys must be unique

### Implementing Classes

#### 1️⃣ HashMap

* No order
* Allows one null key

#### 2️⃣ LinkedHashMap

* Maintains insertion order

#### 3️⃣ TreeMap

* Sorted by keys

#### 4️⃣ Hashtable

* Thread-safe
* Legacy class

---

## 🔁 Iterator Interface

### Description

* Used to traverse collections
* Prevents direct access

### Key Methods

* `hasNext()`
* `next()`
* `remove()`

### Types

* Iterator
* ListIterator

---

## 🛠️ Collections Utility Class

### Description

* Provides static utility methods

### Common Methods

* `sort()`
* `reverse()`
* `shuffle()`
* `binarySearch()`

---

## 🎯 Why Use Interfaces (List, Set, Map)?

```java
List<Integer> list = new ArrayList<>();
```

### Benefits

* Loose coupling
* Easy implementation switch
* Better design

---


---

## ✅ Who Should Use This Repository?

* Java beginners
* Backend developers
* Interview preparation
* Revision before projects

---

## ⭐ Final Note

This repository focuses on **clarity, structure, and real-world understanding** rather than just definitions.

Happy Coding 🚀
