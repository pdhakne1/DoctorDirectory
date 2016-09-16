# DoctorDirectory

getSimilarDoctors()
in this method I find the similar doctors based on their speciality and prioritise based on review score.

eg Below is list of all doctors
id= Doctor1  speciality=A reviewcode=1
id= Doctor2  speciality=A reviewcode=1
id= Doctor3  speciality=B reviewcode=2
id= Doctor4  speciality=C reviewcode=3
id= Doctor5  speciality=C reviewcode=2
id= Doctor6  speciality=C reviewcode=1
id= Doctor7  speciality=C reviewcode=1

then similar doctors are 
id= Doctor4  speciality=C reviewcode=3
id= Doctor5  speciality=C reviewcode=2
id= Doctor6  speciality=C reviewcode=1
id= Doctor7  speciality=C reviewcode=1

Future Enhancement:
Buisness validations for Telephone, Sex, Speciality
Make Speciality as enumeration
Check for duplicate doctor.
Addition and deletion of doctors.
