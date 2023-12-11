package Homework9;
/*
Да се напише клас фирма (Company), който има следните член променливи:
• Име на фирмата – тип string
• Дата на създаване на фирмата – тип string
• Булстат – уникален 10 знаков код включващ букви и цифри – тип string
За всички член променливи напишете get и set методи, като за последния направете проверка за дължина на string-а в
set-метода му(length = 10)
Да се напише клас Фирма-ЕТ, който да наследява класа Фирма и да има следните член променливи:
• Име на собственика, учредил фирмата- тип string
• Първоначален капитал – тип double
• Актуален капитал – тип double
За всички член променливи напишете get и set методи
Класът Фирма-ЕТ трябва да има метод, който изчислява печалбата към днешна дата на фирмата. Той трябва да бъде
нестатичен, да не приема параметри, и трябва да връща като резултат число double, което да бъде разликата
между актуалния и първоначалния капитал на съответната фирма
Създайте интерфейс описващ издаване на фактура и го имплементирайте във Фирма-ЕТ.
 */
public class Company {
    private String companyName;
    private String dateOfFoundation;
    private String vatNumber;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if (companyName.isEmpty()){
            System.out.println("Company name must be entered!");
        }
        else {
            this.companyName = companyName;
        }
    }

    public String getDateOfFoundation() {
        return dateOfFoundation;
    }

    public void setDateOfFoundation(String dateOfFoundation) {
       if (dateOfFoundation.isEmpty()){
           System.out.println("Foundation date must be entered!");
       }
       else {
           this.dateOfFoundation = dateOfFoundation;
       }
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        if (vatNumber.length() < 10){
            System.out.println("VAT number cannot be less than 10 symbols!");
        }
        else if (vatNumber.isEmpty()){
            System.out.println("VAT number must be entered!");
        }
        else {
            this.vatNumber = vatNumber;
        }
    }

    public Company (String companyName, String dateOfFoundation, String vatNumber){
        setCompanyName(companyName);
        setDateOfFoundation(dateOfFoundation);
        setVatNumber(vatNumber);
    }
}
