# JPA-springboot

#Maven manager dependence command:

mvn clean (clean folder temp is target in the root)
mvn validate (validate only that project, is seldom uses )
mvn compile( use for compile your project)
mvn test (check that code is correct )
mvn verify (execute test integration for confirm than is working well)
mvn package ( charge package our file, allow execute and deployment in server, jar, war or ear )
mvn install (the charge deployment repository, local server )
mvn site (generate documentation our project )
mvn deploy(is same install but work in remote server)

#lombok is dependency for getting and setting only use 

@Data
@NoArgsConstructor
@AllArgsConstructor


@Setter
@Getter 
@NoArgsConstructor
@AllArgsConstructor
@ToSring
@EqualsAndHashCode

#MapStruct is DTO automatically 


//********************************************************************************************************
#generate modelo.entidade (direccion, pabellon, persona, alumno, profesor, empleado,aula)
modelo.entidades.enumeradores(pizarron, tipoempleado)
	note:generate construct, construct with overload, getter and setter, tostring, equals and hashcode, foreign key too getter and setter
	decor table and attribute, name table, name column

#@Prepersist and @PreUpdate is automatically logic of date is responsibility form spring, is better 

#@Enbeddable is a class than add the camp another table (entity direccion)

#in the entity person add abstract and @Inheritance have 3 methodes is recommend  @Inheritance(strategy = InheritanceType.JOINED), is the normal relations 

#then create an entity and run the project, the next step is create the repository.
 CrudRepository: functions basic of CRUD (is you choice, but this is more used)
PagingAndSortingRepository: is extends the CrudRepository plus method specific for the pagination and order element 
JpaRepository: is methode relations with JPA
		example: /repositorios/CarreraRepository
	note: is good practice decore with @Repository, but is your interface extends that CrudRepository is implicitly 
note: in the interface repository, is written all functions, buscarPorNombreYApellido, buscarPorDni, buscarPersonaPorApellido (example PersonaRepository, only custom method)

#create a new package is services(same level than repository and model) ,inside create two packages(folders) more, are contract and implementation.

#contract: you declare all Interface DAO(CarreraDAO), all class DAO only used for declare method 
	findById, save, findAll and delete  
	note: that method is that same for all, is more fast use GenericoDAO
public interface PersonaDAO extends GenericoDAO<Persona> {
note: all method create in PersonaRepository, must be called within the class PersonaDAO,in order to be used in the PersonaDAOImpl

#implementation: you declare this class implementation(CarrearDAOImpl), which is used for implementing all methods declared in the interface DAO(CarreraDAO).
implement all methods ctrl + alt + insert or red idea implement all.
declared inside repository (CarreraRepository in the case is the implementation to CarreraDAO) belong (is decorated with @Autowired because injection the interface )
as methods is operation with database is necessary decorated with @Transactional or @Transactional(readOnly = true)

#you have a generalization of student, employee and teacher, in person and in turn this having a class GenericoDAO and GenericoDAOImpl
public interface AlumnoDAO extends PersonaDAO {

#interface CarreraDAO, PersonaDAO have the same method, is recommended Create GenericoDAO in contratos 
public interface CarreraDAO extends GenericoDAO<Carrera> {

#the Class CarreraDAOImpl, GenericoDAOImpl have the same implementation to method, is recommended create GenericoDAOImpl in implementation 
public class CarreraDAOImpl extends GenericoDAOImpl<Carrera, CarreraRepository> implements CarreraDAO {
Note: after the next step is to create a construct father inside each implementation. (alt + insert or better idea red)
  @Autowired
    public CarreraDAOImpl(CarreraRepository repository) {
        super(repository);
    }

Note: or other case person not generate Bean, because used @Qualifier in this construct, is different behind 

    @Autowired
    public AlumnoDAOImpl(@Qualifier("repositorioAlumnos")PersonaRepository repository) {
        super(repository);
    }


#JPQL is sql in spring boot

note: that is the format for operate inside AlumnoRepository in AlumnoDAOImpl, yet what is a generalization, of PersonaDAO : 
        return ((AlumnoRepository)repository).buscarAlumnosPorNombreCarrera(nombre);

note: https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods
