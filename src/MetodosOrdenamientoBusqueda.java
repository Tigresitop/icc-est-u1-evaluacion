import models.Person;

/**
 * MetodosOrdenamientoBusqueda
 * 
 * Aqui programar los motodos de busqueda y ordenamiento
 * segun le tocaron en su enunciado de la evaluacion
 * 
 */
public class MetodosOrdenamientoBusqueda {

    // Selection sort by age
    public void sortByAgeWithSelection(Person[] people) {
        for (int i = 0; i < people.length; i++) {
            int minIndex = i;
            for(int j =  i + 1; j < people.length; j++) {
                if (people[j].getAge() < people[minIndex].getAge()) {
                    minIndex = j;
                }
            }
                Person temp = people[i];
                people[i] = people[minIndex];
                people[minIndex] = temp;
        }
                


            
        }
    }
    

    // Selection sort by height
    public void sortByHeightWithSelection(Person[] people) {
        // TODO: Implement selection sort by height
    }

    // Insertion sort by age
    public void sortByAgeWithInsertion(Person[] people) {
        // TODO: Implement insertion sort by age
    }

    // Insertion sort by height
    public void sortByHeightWithInsertion(Person[] people) {
        // TODO: Implement insertion sort by height
    }

    // Binary search by age
    public int searchBinaryByAge(Person[] people, int age) {
        int izquierda = 0;
        int derecha = people.length - 1;
        int respuesta = -1;
        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;
            if (people[medio].getAge() == age) {
                respuesta = medio;
                break;
                } else if (people[medio].getAge() < age) {
                    izquierda = medio + 1;
                    } else {
                        derecha = medio - 1;
                    }
        }
                        return respuesta;
            
        return -1; // Placeholder return value
    }

    // Binary search by height
    public int searchBinaryByHeight(Person[] people, int height) {
        
        return -1; // Placeholder return value
    }

    // Metodo que imprime el listado de personas
    public void showPeople() {
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].toString());
        }
}

    
