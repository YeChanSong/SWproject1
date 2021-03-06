package com.kwce.controller;

import org.slf4j.Logger; 
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import com.kwce.domain.BoardVO;
import com.kwce.domain.Criteria;
import com.kwce.domain.PageMaker;
import com.kwce.service.BoardService;


@Controller
@RequestMapping("/board/*")
public class BoardController {
	private static final Logger Logger = LoggerFactory.getLogger(BoardController.class);

	@Autowired
	private BoardService service;

	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list(Model model) throws Exception{
		Logger.info("list all page get....");
		model.addAttribute("list",service.listAll()); // listAll()
	
		return "board/list";
	}
	
	@RequestMapping(value="/list1", method=RequestMethod.GET)
	public String list1(Model model) throws Exception{
		Logger.info("list page get....");

		model.addAttribute("list",service.paging()); // listAll()
	
		return "board/list1";
	}
	
	///////////////----------------------------------------------------
	
	@RequestMapping(value="/purchase", method=RequestMethod.GET)
	 public void purchase(@ModelAttribute("cri") Criteria cri, Model model) throws Exception {
		Logger.info("purchase page get....");

				
		model.addAttribute("list", service.purchaseCriteria(cri)); // JSP에 계산된 페이징 출력

	    PageMaker pageMaker = new PageMaker(); // 객체생성

	    pageMaker.setCri(cri); // setCri 메소드 사용

	    pageMaker.setTotalCount(service.purchaseCountCriteria(cri)); // 전체 게시글 갯수 카운트


	    model.addAttribute("pageMaker", pageMaker);
		
		
		
		
	}
	
	
	@RequestMapping(value="/sell", method=RequestMethod.GET)
	 public void sell(@ModelAttribute("cri") Criteria cri, Model model) throws Exception {
		Logger.info("sell page get....");

				
		model.addAttribute("list", service.sellCriteria(cri)); // JSP에 계산된 페이징 출력

	    PageMaker pageMaker = new PageMaker(); // 객체생성

	    pageMaker.setCri(cri); // setCri 메소드 사용

	    pageMaker.setTotalCount(service.sellCountCriteria(cri)); // 전체 게시글 갯수 카운트


	    model.addAttribute("pageMaker", pageMaker);
		
		
		
		
	}
	
	
	@RequestMapping(value="/after", method=RequestMethod.GET)
	 public void after(@ModelAttribute("cri") Criteria cri, Model model) throws Exception {
		Logger.info("after page get....");

				
		model.addAttribute("list", service.afterCriteria(cri)); // JSP에 계산된 페이징 출력

	    PageMaker pageMaker = new PageMaker(); // 객체생성

	    pageMaker.setCri(cri); // setCri 메소드 사용

	    pageMaker.setTotalCount(service.afterCountCriteria(cri)); // 전체 게시글 갯수 카운트


	    model.addAttribute("pageMaker", pageMaker);
		
		
		
		
	}
	
	
	@RequestMapping(value="/accuse", method=RequestMethod.GET)
	 public void accuse(@ModelAttribute("cri") Criteria cri, Model model) throws Exception {
		Logger.info("accuse page get....");

				
		model.addAttribute("list", service.accuseCriteria(cri)); // JSP에 계산된 페이징 출력

	    PageMaker pageMaker = new PageMaker(); // 객체생성

	    pageMaker.setCri(cri); // setCri 메소드 사용

	    pageMaker.setTotalCount(service.accuseCountCriteria(cri)); // 전체 게시글 갯수 카운트


	    model.addAttribute("pageMaker", pageMaker);
		
		
		
		
	}
	
	
	@RequestMapping(value="/freetalk", method=RequestMethod.GET)
	 public void freetalk(@ModelAttribute("cri") Criteria cri, Model model) throws Exception {
		Logger.info("freetalk page get....");

				
		model.addAttribute("list", service.freetalkCriteria(cri)); // JSP에 계산된 페이징 출력

	    PageMaker pageMaker = new PageMaker(); // 객체생성

	    pageMaker.setCri(cri); // setCri 메소드 사용

	    pageMaker.setTotalCount(service.freetalkCountCriteria(cri)); // 전체 게시글 갯수 카운트


	    model.addAttribute("pageMaker", pageMaker);
		
		
		
		
	}
	
	
	
	
	////////////////////------------------------------
	
	
	@RequestMapping(value="/register_purchase", method=RequestMethod.GET)
	public String register_purchaseGET(BoardVO board, Model model) throws Exception{
		Logger.info("register_purchasae page get....");
		return "board/register_purchase";
	}
	
	@RequestMapping(value="/register_purchase", method=RequestMethod.POST)
	public String register_purchasePOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		Logger.info("register_purchase page post....");
		Logger.info(board.toString());		
		service.regist_purchase(board);
		rttr.addFlashAttribute("msg","SUCCESS");
		
		return "redirect:/board/purchase";
	}
	
	@RequestMapping(value="/register_sell", method=RequestMethod.GET)
	public String register_sellGET(BoardVO board, Model model) throws Exception{
		Logger.info("register_sell page get....");
		return "board/register_sell";
	}
	
	@RequestMapping(value="/register_sell", method=RequestMethod.POST)
	public String register_sellPOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		Logger.info("register page post....");
		Logger.info(board.toString());		
		service.regist_sell(board);
		rttr.addFlashAttribute("msg","SUCCESS");
		
		return "redirect:/board/sell";
	}
	
	@RequestMapping(value="/register_after", method=RequestMethod.GET)
	public String register_afterGET(BoardVO board, Model model) throws Exception{
		Logger.info("register_after page get....");
		return "board/register_after";
	}
	
	@RequestMapping(value="/register_after", method=RequestMethod.POST)
	public String register_afterPOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		Logger.info("register_after page post....");
		Logger.info(board.toString());		
		service.regist_after(board);
		rttr.addFlashAttribute("msg","SUCCESS");
		
		return "redirect:/board/after";
	}
	
	@RequestMapping(value="/register_accuse", method=RequestMethod.GET)
	public String register_accuseGET(BoardVO board, Model model) throws Exception{
		Logger.info("register_accuse page get....");
		return "board/register_accuse";
	}
	
	@RequestMapping(value="/register_accuse", method=RequestMethod.POST)
	public String register_accusePOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		Logger.info("register_accuse page post....");
		Logger.info(board.toString());		
		service.regist_accuse(board);
		rttr.addFlashAttribute("msg","SUCCESS");
		
		return "redirect:/board/accuse";
	}
	
	@RequestMapping(value="/register_freetalk", method=RequestMethod.GET)
	public String register_freetaklGET(BoardVO board, Model model) throws Exception{
		Logger.info("register_freetalk page get....");
		return "board/register_freetalk";
	}
	
	@RequestMapping(value="/register_freetalk", method=RequestMethod.POST)
	public String register_freetalkPOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		Logger.info("register_freetalk page post....");
		Logger.info(board.toString());		
		service.regist_freetalk(board);
		rttr.addFlashAttribute("msg","SUCCESS");
		
		return "redirect:/board/freetalk";
	}
	
	
	
	
	
	
	
	@RequestMapping(value="/read_purchase", method=RequestMethod.GET)
	public String read_purchase(@RequestParam("bno") int bno, Model model) throws Exception{
		Logger.info("read_purchase page get....");
		model.addAttribute(service.read_purchase(bno));
		return "board/read_purchase";
	}
	
	@RequestMapping(value="/read_sell", method=RequestMethod.GET)
	public String read_sell(@RequestParam("bno") int bno, Model model) throws Exception{
		Logger.info("read_sell page get....");
		model.addAttribute(service.read_sell(bno));
		return "board/read_sell";
	}
	
	@RequestMapping(value="/read_after", method=RequestMethod.GET)
	public String read_after(@RequestParam("bno") int bno, Model model) throws Exception{
		Logger.info("read_after page get....");
		model.addAttribute(service.read_after(bno));
		return "board/read_after";
	}
	
	@RequestMapping(value="/read_accuse", method=RequestMethod.GET)
	public String read_accuse(@RequestParam("bno") int bno, Model model) throws Exception{
		Logger.info("read_accuse page get....");
		model.addAttribute(service.read_accuse(bno));
		return "board/read_accuse";
	}
	
	@RequestMapping(value="/read_freetalk", method=RequestMethod.GET)
	public String read_freetalk(@RequestParam("bno") int bno, Model model) throws Exception{
		Logger.info("read page get....");
		model.addAttribute(service.read_freetalk(bno));
		return "board/read_freetalk";
	}
	
	
	
	
	
	
	
	@RequestMapping(value="/modify_purchase", method=RequestMethod.GET)
	public String modify_purchaseGET(@RequestParam("bno") int bno, Model model) throws Exception{
		Logger.info("modify_purchase page get....");
		
		model.addAttribute(service.read_purchase(bno));
		return "board/modify_purchase";
	}
	
	
	@RequestMapping(value="/modify_purchase", method=RequestMethod.POST)
	public String modify_purchasePOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		Logger.info("modify_purchase page post....");
		Logger.info(board.toString());
		service.modify_purchase(board);
		rttr.addFlashAttribute("msg","SUCCESS");
		return "redirect:/board/purchase";
	}
	
	
	@RequestMapping(value="/modify_sell", method=RequestMethod.GET)
	public String modify_sellGET(@RequestParam("bno") int bno, Model model) throws Exception{
		Logger.info("modify_sell page get....");
		
		model.addAttribute(service.read_sell(bno));
		return "board/modify_sell";
	}
	
	
	@RequestMapping(value="/modify_sell", method=RequestMethod.POST)
	public String modify_sellPOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		Logger.info("modify_sell page post....");
		Logger.info(board.toString());
		service.modify_sell(board);
		rttr.addFlashAttribute("msg","SUCCESS");
		return "redirect:/board/sell";
	}
	
	@RequestMapping(value="/modify_after", method=RequestMethod.GET)
	public String modify_afterGET(@RequestParam("bno") int bno, Model model) throws Exception{
		Logger.info("modify_after page get....");
		
		model.addAttribute(service.read_after(bno));
		return "board/modify_after";
	}
	
	
	@RequestMapping(value="/modify_after", method=RequestMethod.POST)
	public String modify_afterPOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		Logger.info("modify_after page post....");
		Logger.info(board.toString());
		service.modify_after(board);
		rttr.addFlashAttribute("msg","SUCCESS");
		return "redirect:/board/after";
	}
	
	
	@RequestMapping(value="/modify_accuse", method=RequestMethod.GET)
	public String modify_accuseGET(@RequestParam("bno") int bno, Model model) throws Exception{
		Logger.info("modify_accuse page get....");
		
		model.addAttribute(service.read_accuse(bno));
		return "board/modify_accuse";
	}
	
	
	@RequestMapping(value="/modify_accuse", method=RequestMethod.POST)
	public String modify_accusePOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		Logger.info("modify_accuse page post....");
		Logger.info(board.toString());
		service.modify_accuse(board);
		rttr.addFlashAttribute("msg","SUCCESS");
		return "redirect:/board/accuse";
	}
	
	
	@RequestMapping(value="/modify_freetalk", method=RequestMethod.GET)
	public String modify_freetalkGET(@RequestParam("bno") int bno, Model model) throws Exception{
		Logger.info("modify_freetalk page get....");
		
		model.addAttribute(service.read_freetalk(bno));
		return "board/modify_freetalk";
	}
	
	
	@RequestMapping(value="/modify_freetalk", method=RequestMethod.POST)
	public String modify_freetalkPOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		Logger.info("modify_freetalk page post....");
		Logger.info(board.toString());
		service.modify_freetalk(board);
		rttr.addFlashAttribute("msg","SUCCESS");
		return "redirect:/board/freetalk";
	}
	
	
	
	
	
	@RequestMapping(value="/remove_purchase", method=RequestMethod.POST)
	public String remove_purchase(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception{
		
		service.remove_purchase(bno);
		Logger.info("remove_purchase page post....");
		rttr.addFlashAttribute("msg","SUCCESS");
		return "redirect:/board/purchase";
	}
	
	
	@RequestMapping(value="/remove_sell", method=RequestMethod.POST)
	public String remove_sell(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception{
		
		service.remove_sell(bno);
		Logger.info("remove_sell page post....");
		rttr.addFlashAttribute("msg","SUCCESS");
		return "redirect:/board/sell";
	}
	
	@RequestMapping(value="/remove_after", method=RequestMethod.POST)
	public String remove_after(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception{
		
		service.remove_after(bno);
		Logger.info("remove_after page post....");
		rttr.addFlashAttribute("msg","SUCCESS");
		return "redirect:/board/after";
	}
	
	@RequestMapping(value="/remove_accuse", method=RequestMethod.POST)
	public String remove_accuse(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception{
		
		service.remove_accuse(bno);
		Logger.info("remove_accuse page post....");
		rttr.addFlashAttribute("msg","SUCCESS");
		return "redirect:/board/accuse";
	}
	
	
	@RequestMapping(value="/remove_freetalk", method=RequestMethod.POST)
	public String remove_freetalk(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception{
		
		service.remove_freetalk(bno);
		Logger.info("remove_freetalk page post....");
		rttr.addFlashAttribute("msg","SUCCESS");
		return "redirect:/board/freetalk";
	}
	
	
	
	

	//---------------------------------------------
	
	
	
	
	
	
}
