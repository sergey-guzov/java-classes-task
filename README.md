Create classes with the characteristics given below. Define constructors and methods setType(), getType(), toString(). Define additional methods in the class that create array objects. Set these data selection criteria and output the data to the console. Each course should declare several constructors if information is available.

1. Student: id, SecondName, FirstName, Surname, Birthday, Address, Phone, Facultet, Course, Group.

  Create array of objects. Output:

    a) List of students of the specified facultet;

    b) List of students for every faciltet and course;

    c) List of students born after specified year;

    d) List of students of the specified group.


6. House: id, Flat number, Square, Floor, Rooms Number, Street, Building type.

  Create array of objects. Output:

    a) a list of flats with a given number of rooms;

    b) a list of flats with a given number of rooms and located on a floor that is in a given range;

    c) a list of flats with an square exceeding the given one.

Programm has 2 packages for implementation of the different tasks: student package - for Student task, house package - for House task;

**Students**
programm has next structure:
  1. Class `Student` is data class, which objects store information about students (id, SecondName, FirstName, Surname, Birthday, Address, Phone, Facultet, Course, Group). Class has two nested classes Address and   BirthDay, containig detailed address and birthday information
  2. Enum `Facultet` contains all univercity facultets
  3. Class `StudentCreator` contains a different methods for creation new students, editing information about them
  4. Class `StudentList` is used for creating the list of all students for next manipulation with them
  5. Class `Filter` gets the list of all students and implement methods to filter student objects
  6. Class `Main` is used to launch programm, create/add objects, call methods.

**House**
programm has next structure:
  1. Class `Flat` is data class, which objects store information about flats (id, Square, Floor, Rooms Number, House)
  2. Class `House` is data class, which objects store information about flats (id, Flat number, Floor number, Address, Type, list of flats)
  3. Classes `FlatCreator` and `HouseCreator` contain  methods for creation new flats/houses;
  4. Class `StudentList` is used for creating the list of all students for next manipulation with them
  5. Class `Filter` gets the list of all flats from all houses and implement methods to filter flats objects
  5. Class `Main` is used to launch programm, create/add objects, call methods.
