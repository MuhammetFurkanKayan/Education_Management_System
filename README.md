# Education Management System

A console-based Java application developed using **4 different Design Patterns** to simulate education management processes. The project covers scenarios such as lecture creation, student notification, evaluation system management, and online lecture decoration.

---

## Design Patterns Used

### 1. Factory Pattern

Since lecture prices vary from city to city, a student could accidentally select a lecture from the wrong city's course center, leading to incorrect information and wrong pricing. To solve this, separate `LectureCenter` subclasses are created for each city, where the `createLecture()` method returns only the lectures available in that specific city. This restricts the selectable lectures for each student and eliminates cross-city selection errors.

**Related Classes:**

| Class | Role |
|---|---|
| `LectureCenter` | Abstract factory class |
| `IstanbulLectureCenter` | Concrete factory for Istanbul |
| `AnkaraLectureCenter` | Concrete factory for Ankara |

**Produced Lecture Types:** `MathLecture`, `EnglishLecture`, `PhysicsLecture` (separate implementations for each city)

**Usage Example:**
```java
LectureCenter cent = new IstanbulLectureCenter();
Lecture lesson2 = cent.selectLecture("math");           // Creates IstanbulMathLecture
```

**UML Class Diagram:**

<img width="1181" height="835" alt="factoryYeni drawio" src="https://github.com/user-attachments/assets/bf179abb-175c-40a4-b1af-cb779ade5074" />

---

### 2. Observer Pattern

When lecture information (topic, date, etc.) changes, **registered students and educational publishers** are automatically notified via email.

**Related Classes:**

| Class | Role |
|---|---|
| `Subject` | Observable object interface |
| `Observer` | Observer interface |
| `Lecture` | Subject implementation (observable) |
| `Student` | Observer implementation (observer – student) |
| `EducationalPublisher` | Observer implementation (observer – publisher) |
| `EmailSender` | Email sending interface |

**Usage Example:**
```java
Lecture lesson = new IstanbulMathLecture("k","l");
Lecture lesson1 = new AnkaraPhysicsLecture("x","y");
MathStudent student1 = new MathStudent(lesson);                                    // Auto-registered
PhysicsStudent student2 = new PhysicsStudent(lesson1);
EducationalPublisher publisher = new EducationalPublisherA(lesson,"yayıncı mail");
student1.addStudentEmail("öğrenci mail");
student2.addStudentEmail("mat öğrenci mail");
lesson.notifyObservers();
lesson1.notifyObservers();
lesson.setWeeklyClassTopic("Türev");                                               // All observers are notified
```

**UML Class Diagram:**

<img width="1792" height="844" alt="observerYeni drawio" src="https://github.com/user-attachments/assets/a4466445-5a8c-4a7e-97d7-f8ce3513fee4" />

---

### 3. Strategy Pattern

Enables **dynamically changing the evaluation system** of lectures at runtime. Each lecture type starts with a different default evaluation strategy, which can be switched during execution.

**Related Classes:**

| Class | Role |
|---|---|
| `EvaluationStrategy` | Strategy interface |
| `ExamBasedEvaluation` | Exam-only based evaluation |
| `ProjectBasedEvaluation` | Project-only based evaluation |
| `ExamAndProjectEvaluation` | Exam + project based evaluation |

**Usage Example:**
```java
LectureCenter cent = new IstanbulLectureCenter();
Lecture lesson2 = cent.selectLecture("math");
lesson2.showEvaluationSystem();                        // Default: Exam-based
lesson2.setEvaluationStrategy(new ExamAndProjectEvaluation());
lesson2.showEvaluationSystem();                        // Changed: Exam + Project based
```

**UML Class Diagram:**

<img width="1331" height="744" alt="strategyYen drawio" src="https://github.com/user-attachments/assets/eca8af7b-15b0-49b5-9d3e-e10b4416da43" />

---

### 4. Decorator Pattern

Allows **dynamically adding online lecture features** to an existing lecture. Each online lecture decorator appends its own name and cost to the wrapped lecture.

**Related Classes:**

| Class | Role |
|---|---|
| `OnlineLectureDecorator` | Abstract decorator class |
| `OnlineMathLecture` | Online math lecture decorator +100 TL |
| `OnlineEnglishLecture` | Online English lecture decorator +75 TL |
| `OnlinePhysicsLecture` | Online physics lecture decorator +50 TL |

**Usage Example:**
```java
Lecture lesson5 = new IstanbulEnglishLecture("2019","verbs");      // Base lecture +250 TL
lesson5 = new OnlineMathLecture(lesson5,"2017","üslü");            // +100 TL
lesson5 = new OnlinePhysicsLecture(lesson5,"2018","hareket");      // +50 TL
		
System.out.println(lesson5.getClassName());                        // Istanbul English Class+Online Math Class+Online Physics Class
System.out.println(lesson5.cost());                                // Total: 400 TL
```

**UML Class Diagram:**

<img width="1512" height="744" alt="decoraYeni drawio" src="https://github.com/user-attachments/assets/43afa6b6-d117-49b1-84ae-53807aa376cd" />

---

## Installation and Running

### Requirements

- **Java JDK 11** or higher

### Compile and Run

```bash
# Clone the project
git clone https://github.com/MuhammetFurkanKayan/education-management-system.git
cd education-management-system

# Compile
javac -d out src/source/*.java

# Run
java -cp out source.MainClass
```

### Running with an IDE

1. Open the project with **Eclipse**, **IntelliJ IDEA**, or **VS Code**
2. Navigate to `src/source/MainClass.java`
3. Run the `main` method in `MainClass`

---

## Sample Output

<img width="1314" height="204" alt="Ekran görüntüsü 2026-05-03 005710" src="https://github.com/user-attachments/assets/1734e0d5-ce15-4674-8c3c-8ecd080cb50d" />

---

## Technologies

| Technology | Version |
|---|---|
| Java | 11+ |
| Paradigm | Object-Oriented Programming (OOP) |
| Design Patterns | Strategy, Observer, Factory, Decorator |
