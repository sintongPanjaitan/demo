package id.myindo.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping( value = "/")
public class DefaultController {

    /*@RequestMapping (value = "/", method = RequestMethod.GET)
    public ThymeleafView index() {
        ThymeleafView view = new ThymeleafView("index"); // templateName = 'index'
        return view;
    }*/



    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView view = new ModelAndView("login");
        return view;
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView dashboard() {
        ModelAndView view = new ModelAndView("index");
        return view;
    }

//    @RequestMapping(value = "/form-request-cabang", method = RequestMethod.GET)
//    public String formRequestCabang(Model model) {
//        String active = "active";
//        model.addAttribute("activeFormRequest",active);
//        return "form-request-cabang";
//    }

    @RequestMapping(value = "/list-request-cabang", method = RequestMethod.GET)
    public String requestCabang(Model model, HttpSession session) {
        String active = "active";
        try{
            model.addAttribute("activeListRequest",active);
            return "list-request-cabang";
        }catch (Exception e){
            e.getMessage();
            return "list-request-cabang";
        }



    }

    @RequestMapping(value = "/detail-request-cabang", method = RequestMethod.GET)
    public String detailCabang(Model model, HttpSession session) {
        String active = "active";
        model.addAttribute("activeListRequest",active);
        try{
            String username = (String) session.getAttribute("username");
            System.out.println("kcp : "+username);
            model.addAttribute("activeListRequest",active);
            if(username.equals("kcp")){
                System.out.println("masuk kcp");
                return "approve-request-kepala-cabang";
            }else {
            System.out.println("cabang");
            return "detail-request-cabang";
            }
        }catch (Exception e){
            e.getMessage();
            return "detail-request-cabang";
        }
//        return "detail-request-cabang";
    }

    @RequestMapping(value = "/approve-request-cabang", method = RequestMethod.GET)
    public String approveRequestCabang(Model model) {
        String active = "active";
        model.addAttribute("activeListRequest",active);
        return "approve-request-kepala-cabang";
    }


    @RequestMapping(value = "/stock-cabang", method = RequestMethod.GET)
    public String stockCabang(Model model) {
        String active = "active";
        model.addAttribute("activeStockCabang",active);
        return "stock-cabang";
    }

    @RequestMapping(value = "/checklist-penerimaan-cabang", method = RequestMethod.GET)
    public String checklistPenerimaanCabang(Model model) {
        String active = "active";
        model.addAttribute("activeChecklistPenerimaanCabang",active);
        return "checklist-penerimaan-cabang";
    }

    @RequestMapping(value = "/form-pengambilan-cabang", method = RequestMethod.GET)
    public String formPengambilanCabang(Model model) {
        String active = "active";
        model.addAttribute("activeformPengambilanCabang",active);
        return "form-pengambilan-cabang";
    }

    @RequestMapping(value = "/add-stock-pusat", method = RequestMethod.GET)
    public String addStockPusat(Model model) {
        String active = "active";
        model.addAttribute("activeAddStockPusat",active);
        return "add-stock-pusat";
    }
    @RequestMapping(value = "/list-request-pusat", method = RequestMethod.GET)
    public String listRequestPusat(Model model) {
        String active = "active";
        model.addAttribute("activeListRequestPusat",active);
        return "list-request-pusat";
    }
    @RequestMapping(value = "/approve-request-pusat", method = RequestMethod.GET)
    public String approveRequestPusat(Model model) {
        String active = "active";
        model.addAttribute("activeApproveRequestPusat",active);
        return "approve-request-pusat";
    }
    @RequestMapping(value = "/stock-pusat", method = RequestMethod.GET)
    public String stockPusat(Model model) {
        String active = "active";
        model.addAttribute("activeStockPusat",active);
        return "stock-pusat";
    }
    @RequestMapping(value = "/request-pusat-accepted", method = RequestMethod.GET)
    public String approveRequestAcceptedPusat(Model model) {
        String active = "active";
        model.addAttribute("activeRequestPusatAccepted",active);
        return "request-accepted-pusat";
    }
    @RequestMapping(value = "/request-pusat-pending", method = RequestMethod.GET)
    public String approveRequestPendingPusat(Model model) {
        String active = "active";
        model.addAttribute("activeRequestPusatPending",active);
        return "request-pending-pusat";
    }


//    @RequestMapping(value = "/listAttendence", method = RequestMethod.GET)
//    public ModelAndView listAttendence() {
//        ModelAndView view = new ModelAndView("listAttendence");
//        String sidebarMenuActive ="<li class=\"active treeview\">\n" +
//                "                    <a href=\"#\">\n" +
//                "                        <i class=\"fa fa-dashboard\"></i> <span>List Attendence</span>\n" +
//                "                    </a>\n" +
//                "                </li>";
//        view.addObject("sidebarMenuActive",sidebarMenuActive);
//        String sidebarMenuNonAvtive = "";
//        return view;
//    }


//    @RequestMapping(value = "/formTask", method = RequestMethod.GET)
//    public ModelAndView formTask(Model model) {
//        ModelAndView view = new ModelAndView("formTask");
//        Map< String, String > operators = new HashMap<String, String>();
//        operators.put("samsung", "SAMSUNG");
//        operators.put("nokia", "NOKIA");
//        operators.put("iphone", "IPHONE");
//        model.addAttribute("operators", operators);
//        Map< String, String > selections = new HashMap<String, String>();
//        selections.put("1", "Yes");
//        selections.put("0", "No");
//        model.addAttribute("selections", selections);
//        return view;
//    }
//    @RequestMapping(value = "/formSubsystem", method = RequestMethod.GET)
//    public ModelAndView formSubsystem() {
//        ModelAndView view = new ModelAndView("formSubsystem");
//        return view;
//    }
//    @RequestMapping(value = "/formPattern", method = RequestMethod.GET)
//    public ModelAndView formPattern(Model model) {
//        ModelAndView view = new ModelAndView("formPattern");
//        Map< String, String > selections = new HashMap<String, String>();
//        selections.put("1", "Yes");
//        selections.put("0", "No");
//        model.addAttribute("selections", selections);
//        return view;
//    }




}
