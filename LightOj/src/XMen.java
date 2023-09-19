import java.util.*;
import java.util.stream.*;

// Ability class
class Ability {
    String abilityName;

    Ability() {
        this.abilityName = "Generic";
    }

    public String toString() {
        return this.abilityName;
    }

    static Ability fromString(String abilityName) {
        // Instantiate the proper Ability subclass for the given ability name.
        switch (abilityName) {
            case "Transportation":
                return new Transportation();
            case "Transformation":
                return new Transformation();
            case "Unique_Physiology":
                return new Unique_Physiology();
            case "Bone_Protrusions":
                return new Bone_Protrusions();
            case "Superhuman_Attributes":
                return new Superhuman_Attributes();
            case "Mental_Abilities":
                return new Mental_Abilities();
            case "Elemental_Abilities":
                return new Elemental_Abilities();
            default:
                throw new RuntimeException("Unknown ability " + abilityName);
        }
    }
}

class Transportation extends Ability {
    Transportation() {
        super();
        this.abilityName = "Transportation";
    }
}

class Transformation extends Ability {
    Transformation() {
        super();
        this.abilityName = "Transformation";
    }
}

class Unique_Physiology extends Ability {
    Unique_Physiology() {
        super();
        this.abilityName = "Unique_Physiology";
    }
}

class Bone_Protrusions extends Ability {
    Bone_Protrusions() {
        super();
        this.abilityName = "Bone_Protrusions";
    }
}

class Superhuman_Attributes extends Ability {
    Superhuman_Attributes() {
        super();
        this.abilityName = "Superhuman_Attributes";
    }
}

class Mental_Abilities extends Ability {
    Mental_Abilities() {
        super();
        this.abilityName = "Mental_Abilities";
    }
}

class Elemental_Abilities extends Ability {
    Elemental_Abilities() {
        super();
        this.abilityName = "Elemental_Abilities";
    }
}

// Mutant class
class Mutant {
    String name;
    List<Ability> abilities;

    Mutant(String name) {
        this.name = name;
        abilities = new ArrayList<>();
    }

    Mutant addAbility(String ability) {
        abilities.add(Ability.fromString(ability));
        return this;
    }

    public String toString() {
        List<String> abilityNames = abilities.stream()
            .map(Object::toString)
            .collect(Collectors.toList());
        return name + " has " + String.join(", ", abilityNames);
    }

    static Mutant fromString(String mutantName, String mutantClass) {
        // Instantiate the proper Mutant subclass for the given mutant type.
        switch (mutantClass) {
            case "Alpha_Mutant":
                return new Alpha_Mutant(mutantName);
            case "Beta_Mutant":
                return new Beta_Mutant(mutantName);
            case "Epsilon_Mutant":
                return new Epsilon_Mutant(mutantName);
            case "Omega_Mutant":
                return new Omega_Mutant(mutantName);
            default:
                throw new RuntimeException("Unknown mutant type " + mutantClass);
        }
    }
}

class Alpha_Mutant extends Mutant {
    Alpha_Mutant(String name) {
        super(name);
    }
}

class Beta_Mutant extends Mutant {
    Beta_Mutant(String name) {
        super(name);
    }
}

class Epsilon_Mutant extends Mutant {
    Epsilon_Mutant(String name) {
        super(name);
    }
}

class Omega_Mutant extends Mutant {
    Omega_Mutant(String name) {
        super(name);
    }
}

public class XMen {
    public static void main(String[] args) {

        List<Mutant> mutants = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline from input

        for (int i = 0; i < n; ++i) {
            String input = scanner.nextLine();

            String[] parts = input.split(" ");
            Mutant mutant = Mutant.fromString(parts[0], parts[1]);
            mutants.add(mutant);
            for (int j = 2; j < parts.length; ++j) {
                mutant.addAbility(parts[j]);
            }
        }

        // Report mutants
        printMutantClass("Alpha_Mutant", mutants);
        printMutantClass("Beta_Mutant", mutants);
        printMutantClass("Epsilon_Mutant", mutants);
        printMutantClass("Omega_Mutant", mutants);

        // Create a list to store the ability names
        // Create a list to store the ability names
        List<String> abilityNames = Arrays.asList(
            "Transportation", "Transformation", "Unique_Physiology",
            "Bone_Protrusions", "Superhuman_Attributes",
            "Mental_Abilities", "Elemental_Abilities"
        );        
        // Report ability count
        for (Mutant mutant : mutants) {
            for (Ability ability : mutant.abilities) {
                String abilityName = ability.toString();
                if (!abilityNames.contains(abilityName)) {
                    abilityNames.add(abilityName);
                }
            }
        }

        // Sort the ability names alphabetically
        Collections.sort(abilityNames);

        for (String abilityName : abilityNames) {
            printAbilityCount(abilityName, mutants);
        }
    }

    static void printMutantClass(String className, List<Mutant> mutants) {
        System.out.println(className + ":");
        List<String> res = new ArrayList<>();

        for (Mutant mutant : mutants) {
            if (mutant.getClass().getSimpleName().equals(className)) {
                res.add(mutant.name);
            }
        }
        
        Collections.sort(res);
        System.out.println(String.join(", ", res));
    }

    static void printAbilityCount(String abilityName, List<Mutant> mutants) {
        int count = 0;

        for (Mutant mutant : mutants) {
            for (Ability ability : mutant.abilities) {
                if (ability.toString().equals(abilityName)) {
                    count++;
                
                }
            }
        }
        
        System.out.println(abilityName + ": " + count);
    }
}
