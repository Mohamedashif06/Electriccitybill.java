            super(name, id, address, mail, mobile, bp);
            calculateSalary(110, 20, 12, 5);
        }
    }

    static class AssociateProfessor extends Employee {
        AssociateProfessor(String name, String id, String address, String mail, long mobile, double bp) {
            super(name, id, address, mail, mobile, bp);
            calculateSalary(130, 30, 12, 10);
        }
    }

    static class Professor extends Employee {
        Professor(String name, String id, String address, String mail, long mobile, double bp) {
            super(name, id, address, mail, mobile, bp);
            calculateSalary(140, 40, 12, 15);
        }
    }
