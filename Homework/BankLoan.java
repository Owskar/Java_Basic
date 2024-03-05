import javax.swing.JOptionPane;

class Loan {
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private String DOB;
    private String Gender;
    private String PermanantAddress;
    private String AadharNO;
    private String PanCardNo;
    private String MobileNO;
    private String Occupation;
    private double an;
    private double mb;

    public void setData() {
        FirstName = JOptionPane.showInputDialog("Enter the First name");
        MiddleName = JOptionPane.showInputDialog("Enter the Middle name");
        LastName = JOptionPane.showInputDialog("Enter the Last name");
        DOB = JOptionPane.showInputDialog("Enter the Date of birth ");
        Gender = JOptionPane.showInputDialog("Enter the Gender ");
        PermanantAddress = JOptionPane.showInputDialog("Enter the Permanant address ");
        AadharNO = JOptionPane.showInputDialog("Enter the Aadhar Number ");
        an = Double.parseDouble(AadharNO);
        PanCardNo = JOptionPane.showInputDialog("Enter the PAN Card number ");
        MobileNO = JOptionPane.showInputDialog("Enter the Mobile Number ");
        mb = Double.parseDouble(MobileNO);
        Occupation = JOptionPane.showInputDialog("Enter the Occupation ");
    }

    public void showData() {
        System.out.println("First name : " + FirstName);
        System.out.println("Middle Name :" + MiddleName);
        System.out.println("Last Name" + LastName);
        System.out.println("Date of birth :" + DOB);
        System.out.println("Gender :" + Gender);
        System.out.println("Permanant Address :" + PermanantAddress);
        System.out.println("Aadhar number :" + an);
        System.out.println("Pancard Number :" + PanCardNo);
        System.out.println("Mobile Number" + mb);
        System.out.println("Occupation :" + Occupation);
    }
}

class HomeLoan extends Loan {
    private String AddressOfProperty;
    private String TypeOfProperty;
    private String OldOwner;
    private double CarpetArea;
    private String ca;
    private double BuildupArea;
    private String ba;

    private String TypeOfBorrower;
    private String NameOfBorrower;

    private int GrossIncome;
    private String gi;

    private int LoanAmount;
    private String LA;

    private double ROI;
    private String roi;

    private int Duration;
    private String D;

    private int DownPayment;
    private String DP;

    private int TotalCost;
    private double EMI;

    public void setData() {

        super.setData();
        AddressOfProperty = JOptionPane.showInputDialog("AddressOfProperty :");
        TypeOfProperty = JOptionPane.showInputDialog("TypeOfProperty :");
        OldOwner = JOptionPane.showInputDialog("OldOwner :");

        ca = JOptionPane.showInputDialog("Carpet Area :");
        CarpetArea = Integer.parseInt(ca);

        ba = JOptionPane.showInputDialog("Buildup  Area :");
        CarpetArea = Integer.parseInt(ba);

        TypeOfBorrower = JOptionPane.showInputDialog("Type of Borrower");
        NameOfBorrower = JOptionPane.showInputDialog("Name of borrower");

        gi = JOptionPane.showInputDialog("Gross income");
        GrossIncome = Integer.parseInt(gi);

        LA = JOptionPane.showInputDialog("Loan Amount ");
        LoanAmount = Integer.parseInt(LA);

        roi = JOptionPane.showInputDialog("Rate of interest");
        ROI = Integer.parseInt(roi);

        D = JOptionPane.showInputDialog("Enter the Duration time ");
        Duration = Integer.parseInt(D);

        DP = JOptionPane.showInputDialog("Downpayment ");
        DownPayment = Integer.parseInt(DP);

    }

    public int Totalcost(int la, int dp) {
        TotalCost = LoanAmount - DownPayment;
        return TotalCost;

    }

    public double EMIs() {
        EMI = (LoanAmount + ((LoanAmount * ROI * 100) * Duration)) / (Duration * 12);
        return EMI;
    }

    public void showData() {
        super.showData();
        System.out.println("Adderess of property is :" + AddressOfProperty);
        System.out.println("Type of property is :" + TypeOfProperty);
        System.out.println("Old Owner is :" + OldOwner);
        System.out.println("Carpet area :" + CarpetArea);
        System.out.println("Buildup area :" + BuildupArea);
        System.out.println("Type of borrower : " + TypeOfBorrower);
        System.out.println("Name of borrower : " + NameOfBorrower);
        System.out.println("Gross income : " + GrossIncome);
        System.out.println("Loan Amount :" + LoanAmount);
        System.out.println("Downpayment :" + DownPayment);

        System.out.println("Total cost is  :" + Totalcost(LoanAmount, DownPayment));
        System.out.println("EMI amount is :" + EMIs());
        System.out.println("Gross income :" + GrossIncome);
    }

}

class EducationLoan extends Loan {
    private String clgname, degretype, degrename, gardian_name, occupation;
    private double tenth, twelth, ROI;
    private int duration, gardincome, loanamt, durationrefund;

    public void setData() {
        super.setData();
        clgname = JOptionPane.showInputDialog("Enter the college name ");

        degretype = JOptionPane.showInputDialog("Enter the degree type");

        String per = JOptionPane.showInputDialog("Enter the 10th percentage");
        tenth = Double.parseDouble(per);

        String per2 = JOptionPane.showInputDialog("Enter the 12th percentage");
        twelth = Double.parseDouble(per2);

        degrename = JOptionPane.showInputDialog("Enter the degree name");

        String dur = JOptionPane.showInputDialog("Enter the duration of degree");
        duration = Integer.parseInt(dur);

        gardian_name = JOptionPane.showInputDialog("Enter the gardian name");

        occupation = JOptionPane.showInputDialog("Enter the occupation");

        String gard = JOptionPane.showInputDialog("Enter the Gardin income");
        gardincome = Integer.parseInt(gard);

        String lnamt = JOptionPane.showInputDialog("Enter the loan amount");
        loanamt = Integer.parseInt(lnamt);

        String ro = JOptionPane.showInputDialog("Enter the Rate of intrest");
        ROI = Double.parseDouble(ro);

        String durref = JOptionPane.showInputDialog("Enter the duration refund");
        durationrefund = Integer.parseInt(durref);
    }

    public int distursementFund() {
        int Distursementfund = (loanamt) / (duration);
        return Distursementfund;
    }

    public double EMIs() {
        double emi = (loanamt + (loanamt * ROI) * duration) / (duration * 12);
        return emi;
    }

    public void showData() {
        super.showData();
        System.out.println("college name is " + clgname);
        System.out.println("Degree type is " + degretype);
        System.out.println("10th percentage are " + tenth);
        System.out.println("12th percentage are " + twelth);
        System.out.println("Degree name is " + degrename);
        System.out.println("Duration of degree is " + duration);
        System.out.println("gardian name is " + gardian_name);
        System.out.println("occupation is " + occupation);
        System.out.println("gardian income is " + gardincome);
        System.out.println("loan amount is " + loanamt);
        System.out.println("Rate of intrest is " + ROI);
        System.out.println("Duration of refund is " + durationrefund);
        System.out.println("Distursementfund is " + distursementFund());
        System.out.println("EMI amount is " + EMIs());
    }

}

class PersonalLoan extends Loan {
    private String companyName, jobProfile, otherEmi, currentAdd;
    private int salary, cibilscore, jobexperiencce, currentorgn, noofyearincurrentadd, loanamt, duration, processingfee,
            noofdepends;
    private double ROI;

    public void setData() {
        super.setData();
        companyName = JOptionPane.showInputDialog("Enter the company name ");

        jobProfile = JOptionPane.showInputDialog("Enter the job profile ");

        String sal = JOptionPane.showInputDialog("Enter the salary");
        salary = Integer.parseInt(sal);

        otherEmi = JOptionPane.showInputDialog("Enter the other Emi");

        String ciscore = JOptionPane.showInputDialog("Enter the cibilscore");
        cibilscore = Integer.parseInt(ciscore);

        String job = JOptionPane.showInputDialog("Enter the job experience");
        jobexperiencce = Integer.parseInt(job);

        String emp = JOptionPane.showInputDialog("Enter the Employer with current orgnanization ");
        currentorgn = Integer.parseInt(emp);

        currentAdd = JOptionPane.showInputDialog("Enter the current address");

        String noyear = JOptionPane.showInputDialog("Enter the no.of year in current address");
        noofyearincurrentadd = Integer.parseInt(noyear);

        String amt = JOptionPane.showInputDialog("Enter the loan amount");
        loanamt = Integer.parseInt(amt);

        String ro = JOptionPane.showInputDialog("Enter the Rate of intrest");
        ROI = Double.parseDouble(ro);

        String dur = JOptionPane.showInputDialog("Enter the duration");
        duration = Integer.parseInt(dur);

        String profee = JOptionPane.showInputDialog("Enter th processing fees");
        processingfee = Integer.parseInt(profee);

        String nodep = JOptionPane.showInputDialog("Enter the no of depends");
        noofdepends = Integer.parseInt(nodep);
    }

    // use this using return
    public void inhandloan() {
        int inthandloan = loanamt - processingfee;

        System.out.println("In Hnad Loan is " + inthandloan);
    }

    public double EMIs() {
        double emi = (loanamt + (loanamt * ROI) * duration) / (duration * 12);
        return emi;
    }

    public void showData() {
        super.showData();
        System.out.println("The company name  is" + companyName);
        System.out.println("job profile is " + jobProfile);
        System.out.println("salary is " + salary);
        System.out.println("other Emi is " + otherEmi);
        System.out.println("cibilscore is " + cibilscore);
        System.out.println("job experience is " + jobexperiencce);
        System.out.println("Employer with current orgn is " + currentorgn);
        System.out.println("current address is " + currentAdd);
        System.out.println("no.of year in current address is " + noofyearincurrentadd);
        System.out.println("loan amount is " + loanamt);
        System.out.println("Rate of intrest is " + ROI);
        System.out.println("duration is " + duration);
        System.out.println("The processing fees is " + processingfee);
        System.out.println("The no of depends are " + noofdepends);
        System.out.println("EMI amount is " + EMIs());
    }

}

class BusinessLoan extends Loan {
    private String typeBusiness, businessDetails, ownerName, businessName, businessAdd;
    private int regno, capital, loanamt, duration;
    private double sharesofowner, ROI;

    public void setData() {
        super.setData();
        typeBusiness = JOptionPane.showInputDialog("Enter the type of business");

        businessDetails = JOptionPane.showInputDialog("Enter the business Details");

        ownerName = JOptionPane.showInputDialog("Enter the owner name");

        String share = JOptionPane.showInputDialog("Enter the shares % of owner");
        sharesofowner = Double.parseDouble(share);

        businessName = JOptionPane.showInputDialog("Enter the Business name");

        String rgno = JOptionPane.showInputDialog("Enter the registration no ");
        regno = Integer.parseInt(rgno);

        businessAdd = JOptionPane.showInputDialog("Enter the Business address");

        String ca = JOptionPane.showInputDialog("Enter the capital");
        capital = Integer.parseInt(ca);

        String amt = JOptionPane.showInputDialog("Enter the loan amount");
        loanamt = Integer.parseInt(amt);

        String ro = JOptionPane.showInputDialog("Enter the Rate of intrest");
        ROI = Double.parseDouble(ro);

        String dur = JOptionPane.showInputDialog("Enter the duration");
        duration = Integer.parseInt(dur);

    }

    public double EMIs() {
        double emi = (loanamt + (loanamt * ROI) * duration) / (duration * 12);
        return emi;
    }

    public int asset() {
        int totalasset = capital + loanamt;
        return totalasset;
    }

    public void showData() {
        super.showData();
        System.out.println("type of business is " + typeBusiness);
        System.out.println("business Details is " + businessDetails);
        System.out.println("owner name is " + ownerName);
        System.out.println("shares % of owner is " + sharesofowner);
        System.out.println("Business name is " + businessName);
        System.out.println("registration no is " + regno);
        System.out.println("Business address is " + businessAdd);
        System.out.println("capital is " + capital);
        System.out.println("loan amount is " + loanamt);
        System.out.println("Rate of intrest is " + ROI);
        System.out.println("duration is " + duration);
        System.out.println("EMI amount is " + EMIs());
        System.out.println("total Asset is " + asset());
    }

}

class CarLoan extends Loan {
    private String carname, modelname, fuletype, accessname;
    private int carcc, ex_showroomprice, insurance_year, insurance_amt, RTO_charges, accesseries_cost, downpay, loanamt,
            duration;
    private double ROI;

    public void setData() {
        super.setData();
        carname = JOptionPane.showInputDialog("Enter the car name");

        modelname = JOptionPane.showInputDialog("Enter the model name");

        String cc = JOptionPane.showInputDialog("Enter the car cc");
        carcc = Integer.parseInt(cc);

        fuletype = JOptionPane.showInputDialog("Enter the fule type");

        String ex = JOptionPane.showInputDialog("Enter the exshowroom price");
        ex_showroomprice = Integer.parseInt(ex);

        String inyear = JOptionPane.showInputDialog("Enter the Insurance years");
        insurance_year = Integer.parseInt(inyear);

        String inamt = JOptionPane.showInputDialog("Enter the Insurance amount");
        insurance_amt = Integer.parseInt(inamt);

        String rio = JOptionPane.showInputDialog("Enter the RTO charges");
        RTO_charges = Integer.parseInt(rio);

        accessname = JOptionPane.showInputDialog("Enter the accesseries name");

        String acccost = JOptionPane.showInputDialog("Enter the accesseries cost");
        accesseries_cost = Integer.parseInt(acccost);

        String down = JOptionPane.showInputDialog("Enter the down payment amount");
        downpay = Integer.parseInt(down);

        String amt = JOptionPane.showInputDialog("Enter the loan amount");
        loanamt = Integer.parseInt(amt);

        String ro = JOptionPane.showInputDialog("Enter the Rate of intrest");
        ROI = Double.parseDouble(ro);

        String dur = JOptionPane.showInputDialog("Enter the duration");
        duration = Integer.parseInt(dur);
    }

    public int onroadprice() {
        int onroadprice = ex_showroomprice + insurance_amt + accesseries_cost + RTO_charges;
        return onroadprice;
    }

    public double EMIs() {
        double emi = (loanamt + (loanamt * ROI) * duration) / (duration * 12);
        return emi;
    }

    public void showData() {
        super.showData();
        System.out.println("car name is " + carname);
        System.out.println("model name is " + modelname);
        System.out.println("car cc is " + carcc);
        System.out.println("fule type is " + fuletype);
        System.out.println("exshowroom price is " + ex_showroomprice);
        System.out.println("Insurance years are " + insurance_year);
        System.out.println("Insurance amount is " + insurance_amt);
        System.out.println(" RTO charges are " + RTO_charges);
        System.out.println("accesseries name is " + accessname);
        System.out.println("accesseries cost is" + accesseries_cost);
        System.out.println("Downpayment is " + downpay);
        System.out.println("loan amount is " + loanamt);
        System.out.println("Rate of intrest is " + ROI);
        System.out.println("duration is " + duration);
        System.out.println("On road price is " + onroadprice());
        System.out.println("EMI amount is " + EMIs());
    }

}

class GoldLoan extends Loan {
    private String goldSmithName, addGold;
    private int avgCost, detailsofGold, currentavg, itemwisedes, loanamt, duration;
    private double wt_ofgold, ROI;

    public void setData() {
        super.setData();
        String wt = JOptionPane.showInputDialog("Enter the weight of gold");
        wt_ofgold = Double.parseDouble(wt);

        String avg = JOptionPane.showInputDialog("Enter the average cost");
        avgCost = Integer.parseInt(avg);

        String degold = JOptionPane.showInputDialog("Enter the Details of gold");
        detailsofGold = Integer.parseInt(degold);

        String cuavg = JOptionPane.showInputDialog("Enter the Current average cost");
        currentavg = Integer.parseInt(cuavg);

        String itde = JOptionPane.showInputDialog("Enter the item wise description");
        itemwisedes = Integer.parseInt(itde);

        goldSmithName = JOptionPane.showInputDialog("Enter the gold smith name");

        addGold = JOptionPane.showInputDialog("Enter the address of gold smith");

        String amt = JOptionPane.showInputDialog("Enter the loan amount");
        loanamt = Integer.parseInt(amt);

        String ro = JOptionPane.showInputDialog("Enter the Rate of intrest");
        ROI = Double.parseDouble(ro);
        String dur = JOptionPane.showInputDialog("Enter the duration");
        duration = Integer.parseInt(dur);
    }

    public double settlement() {
        double settlement_amt = (loanamt) + (loanamt * ROI * duration);
        return settlement_amt;
    }

    public double EMIs() {
        double emi = (loanamt + (loanamt * ROI) * duration) / (duration * 12);
        return emi;
    }

    public void showData() {
        super.showData();
        System.out.println("weight of gold is " + wt_ofgold);
        System.out.println(" average cost is " + avgCost);
        System.out.println("Details of gold are " + detailsofGold);
        System.out.println("Current average cost is " + currentavg);
        System.out.println("item wise description is " + itemwisedes);
        System.out.println("gold smith name is " + goldSmithName);
        System.out.println("address of gold smith is " + addGold);
        System.out.println("loan amount is " + loanamt);
        System.out.println("Rate of intrest is " + ROI);
        System.out.println("duration is " + duration);
        System.out.println("EMI amount is " + EMIs());
        System.out.println("Settlement amount is " + settlement());
    }

}

class FarmLoan extends Loan {
    private String villege_name, seven12_details, crop_details, landtype_details;
    private int gatno, loanamt, duration, sharecut_amt;
    private double areaof_farminhector, ROI;

    public void setData() {
        super.setData();
        villege_name = JOptionPane.showInputDialog("Enter the Villege name");

        String gat = JOptionPane.showInputDialog("Enter the Gat number");
        gatno = Integer.parseInt(gat);

        seven12_details = JOptionPane.showInputDialog("Enter the 7/12 details");

        crop_details = JOptionPane.showInputDialog("Enter the crop details");

        String arfa = JOptionPane.showInputDialog("Enter the area of farm in hector");
        areaof_farminhector = Double.parseDouble(arfa);

        landtype_details = JOptionPane.showInputDialog("Enter the land type details");

        String amt = JOptionPane.showInputDialog("Enter the loan amount");
        loanamt = Integer.parseInt(amt);

        String ro = JOptionPane.showInputDialog("Enter the Rate of intrest");
        ROI = Double.parseDouble(ro);

        String dur = JOptionPane.showInputDialog("Enter the duration");
        duration = Integer.parseInt(dur);

        String share = JOptionPane.showInputDialog("Enter the share cut amount");
        sharecut_amt = Integer.parseInt(share);
    }

    public int inlandloan() {
        int inlandamt = loanamt - sharecut_amt;
        return inlandamt;
    }

    public double settlement() {
        double settlement_amt = (loanamt) + (loanamt * ROI * duration);
        return settlement_amt;
    }

    public void showData() {
        super.showData();
        System.out.println("Villege name is " + villege_name);
        System.out.println("Gat number is " + gatno);
        System.out.println("7/12 details are " + seven12_details);
        System.out.println("crop details are " + crop_details);
        System.out.println("area of farm in hector is " + areaof_farminhector);
        System.out.println("land type details" + landtype_details);
        System.out.println("loan amount is " + loanamt);
        System.out.println("Rate of intrest is " + ROI);
        System.out.println("duration is " + duration);
        System.out.println("share cut amount is " + sharecut_amt);
        System.out.println("In land amount is " + inlandloan());
        System.out.println("Settlement amount is " + settlement());
    }

}

class BankLoan {
    public static void main(String[] args) {
		
		System.out.println();
		System.out.println();
		
		
        HomeLoan l1 = new HomeLoan();
        l1.setData();
        l1.showData();
		
		System.out.println();
		System.out.println();
		
        EducationLoan l2 = new EducationLoan();
        l2.setData();
        l2.showData();

		System.out.println();
		System.out.println();
		
        PersonalLoan l3 = new PersonalLoan();
        l3.setData();
        l3.showData();
		
		System.out.println();
		System.out.println();

        BusinessLoan l4 = new BusinessLoan();
        l4.setData();
        l4.showData();

		System.out.println();
		System.out.println();
		
        CarLoan l5 = new CarLoan();
        l5.setData();
        l5.showData();

		System.out.println();
		System.out.println();
		
        GoldLoan l6 = new GoldLoan();
        l6.setData();
        l6.showData();

		System.out.println();
		System.out.println();
		
        FarmLoan l7 = new FarmLoan();
        l7.setData();
        l7.showData();
		
		System.out.println();
		System.out.println();

    }
}