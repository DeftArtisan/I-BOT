import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;

import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.Nullable;
import javax.lang.model.element.Element;
import javax.swing.JFrame;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;


public class Automative implements Serializable{
	
	
	@SuppressWarnings("deprecation")
	private final static Integer[] _ADCOORD_ = new Integer[] {972, 266};
	static WebDriver _DRIVER_ = new ChromeDriver(new ChromeOptions().setPageLoadStrategy(PageLoadStrategy.NORMAL));
	private final static String _PATH_ = null;
	private static String[] _CONST_DES_;
	private final static long _MOD_LIMIT_ = 120000;
	
	static {
		Utils.enablement();
	}
	
	public static void main(String[] args) throws FileNotFoundException, AWTException {
		Automative.finalization();
	}
	
	public static void finalization() throws AWTException, FileNotFoundException {
		try {
		_DRIVER_.get(Utils.Validative._PATH_.getValidative());
		_DRIVER_.findElement(By.xpath("/html/body/div[4]/div/div/button[2]")).click();
		Utils.closureOfUnusedTabs(Optional.empty()).devoration(_DRIVER_);
        Thread.sleep(1000);
		_DRIVER_.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys(Utils.Validative._EMAIL_.getValidative());
		Thread.sleep(1000);
		_DRIVER_.findElement(By.cssSelector("#loginForm > div > div:nth-child(2) > div > label > input")).sendKeys(Utils.Validative._PASS_.getValidative());
		new WebDriverWait(_DRIVER_, Duration.ofSeconds(2)).ignoring(ElementClickInterceptedException.class, TimeoutException.class).until(new Function<>() {
			@Override public Object apply(WebDriver _DRIVERR_) {
				if(_DRIVERR_.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button")).isDisplayed())
					_DRIVERR_.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button")).click();	
					return true;
			}
		});
		try {
			new WebDriverWait(_DRIVER_, Duration.ofSeconds(4))
			.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div/div/button[2]")));
			_DRIVER_.findElement(By.xpath("/html/body/div[4]/div/div/button[2]")).click();
		} catch(NoSuchElementException | TimeoutException exception) {
			Thread.sleep(3000);
			_DRIVER_.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/section/nav/div[2]/div/div/div[2]/input")).sendKeys("fitnessslap");
			Thread.sleep(2500);
			_DRIVER_.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/section/nav/div[2]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/a")).click();
			Utils.approximatePresence().accept(4, "//*[@id=\"react-root\"]/div/div/section/main/div/header/section/div[1]/h2");
			Utils.extensiveness(511, 549).accept(InputEvent.BUTTON1_DOWN_MASK, new Robot());
			Utils.approximatePresence().accept(3, "/html/body/div[6]/div[3]/div/article/div/div[2]/div/div/div[2]/div[1]/ul/div/li/div/div/div[2]/div[1]/span");
			_CONST_DES_ = new String[] {_DRIVER_.findElement(By.xpath("/html/body/div[6]/div[3]/div/article/div/div[2]/div/div/div[2]/div[1]/ul/div/li/div/div/div[2]/div[1]/span")).getText()};
			_DRIVER_.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
			Utils.localizationDown().devoration(_DRIVER_, _DRIVER_.getCurrentUrl());
			final String s = Utils.contentUpload(new Robot())
					.apply(_CONST_DES_[0], _DRIVER_);
		}
		
		} catch(InterruptedException | NoSuchElementException esc) {
			
		}
		//Utils.exportSer().accept(new Automative(), "activity");//exported
	}
	
	
	protected static abstract class Utils{
		public enum Validative{
			_PATH_("https://www.instagram.com/"),
			_EMAIL_("bakereb683@eosbuzz.com"), //bakereb683@eosbuzz.com
			_USER_("fi.tnessgrinder"),
			_PASS_("fCWrz4Y3LCzix9pA"),//fCWrz4Y3LCzix9pA
			_TARGET_("fitnessslap, gains.land"), 
			_DEL_PATH_("C:\\Users\\Rumen\\Downloads"),
			_CLONE_POSTS_("");
			
			String deficint;
			
			Validative(final String deficint) {
				this.deficint = deficint;
			}
			public void setter(final String deficint) {
				this.deficint = deficint;
			}
			
			public final String getValidative() { return this.deficint; }
			public Stream<Validative> stream() {return Stream.of(Validative.values()); }
			public Collection<Validative> collective() {return Collections.unmodifiableCollection(List.of(Validative.values()));}
		}
		
		@FunctionalInterface
		public interface Consumeristic<T, T_R> {
			public void devoration(T exemp, T_R exemps);
		}
		@FunctionalInterface
		public interface Executive<T extends WebDriver> {
			public void devoration(T exemp);
		}
		
		public static Executive<WebDriver> closureOfUnusedTabs(Optional<int[]> tab){
			return entry -> {
				try {
					while(true) {
						if(entry.getWindowHandles().size() > 1)
							break;
					}
					entry.switchTo().window(_DRIVER_.getWindowHandles().stream().map(e -> e).collect(Collectors.toCollection(ArrayList::new)).get(1));	
					entry.close();
					entry.switchTo().window(_DRIVER_.getWindowHandles().stream().map(e -> e).collect(Collectors.toCollection(ArrayList::new)).get(0));	
				} catch(Exception exce) {}
			};
		}
		
		public static BiConsumer<Integer, String> approximatePresence(){
			return (entry, dur)-> {
				new WebDriverWait(_DRIVER_, Duration.ofSeconds(entry))
				.until(ExpectedConditions
						.presenceOfElementLocated(By.xpath(dur)));
			};
		}
		
		
		public static Consumer<WebDriver> executive() {
			return entry -> {
				((JavascriptExecutor) entry).executeScript("window.scrollTo(0, document.body.scrollHeight);");
			};
		}
		
		public static BiConsumer<Integer, Robot> extensiveness(int... coordinates){
			return (entry, entry2) -> {
				entry2.mouseMove(coordinates[0], coordinates[1]); // video nagivation 511/ 549
				entry2.mousePress(entry);	
				entry2.mouseRelease(entry);//first window
				//_DRIVER_.switchTo().window(_DRIVER_.getWindowHandles().stream().map(e -> e)
					//	.collect(Collectors.toCollection(ArrayList::new)).get(0));
			};
		}
		
		public static Consumeristic<WebDriver, String> localizationDown(){
			return (entry, entry2)-> {
				entry.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
				entry.switchTo().newWindow(WindowType.TAB);
				entry.navigate().to("https://inflact.com/downloader/instagram/video/");
				//checking non-disabable pop-ups
				try {
					if(new WebDriverWait(_DRIVER_, Duration.ofSeconds(5)).ignoreAll(List.of(InvalidSelectorException.class, ElementClickInterceptedException.class))
				            .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"qc-cmp2-ui\"]/div[2]/div/button[2]"))) != null) {
					         entry.findElement(By.xpath("//*[@id=\"qc-cmp2-ui\"]/div[2]/div/button[2]")).click();
				    }
					throw new TimeoutException();
			   } catch(TimeoutException excep) {
					entry.findElement(By.xpath("//*[@id=\"downloaderform-url\"]")).sendKeys(entry2);
					entry.findElement(By.xpath("//*[@id=\"search\"]")).click();
					entry.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
					entry.findElement(By.xpath("//*[@id=\"ajax-results\"]/div[1]/div[1]/div/div/div[3]/a")).click(); 
					try {
						Utils.extensiveness(231, 1056).accept(InputEvent.BUTTON1_DOWN_MASK, new Robot());
						Utils.extensiveness(289, 1146).accept(InputEvent.BUTTON1_DOWN_MASK, new Robot());	
					} catch(Exception exce) {}
			   }
			};
		}
		
		public static Consumer<Collection<Long>> calculative(){
			return entry -> {
				while(entry.size() <= 200)
					try {
						Robot robotisized = new Robot();
						robotisized.mouseMove(0, 0);
						new Robot().mousePress(InputEvent.BUTTON1_DOWN_MASK);
					} catch (AWTException e) {
						e.printStackTrace();
					}
			};
		}
		//internal replacement of duplicates/avoidance of dowble function call
		private static Function<String, String> filterDescr(final String coexistent){
			return entry -> {
				return new StringBuilder().append(new StringBuilder().append(entry).
						replace(new StringBuilder().append(entry).indexOf(coexistent), new StringBuilder().append(entry).indexOf(coexistent) 
								+ coexistent.length(), 
								Utils.Validative._USER_.getValidative()).toString())
						.replace(new StringBuilder().append(entry).lastIndexOf(coexistent) + 4, new StringBuilder().append(entry).lastIndexOf(coexistent) 
						        + coexistent.length() + 4, 
						        Utils.Validative._USER_.getValidative()).toString();
			};
		}
	
		
		
		public static BiConsumer<Object, String> exportSer() throws FileNotFoundException{
			return (entry, entry2)-> {
				assert(new File(entry2).isDirectory());
				try {
					ObjectOutputStream objection = new ObjectOutputStream(new FileOutputStream(new File(entry2)));
					objection.writeObject(entry);
					objection.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			};
		}
		
		
		
		public static BiFunction<String, WebDriver, String> contentUpload(Robot rob) {
			return (pathentr, entry) -> {
				try {
					Utils.closureOfUnusedTabs(Optional.empty()).devoration(entry);
					entry.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
					entry.navigate().back();
					new WebDriverWait(entry, Duration.ofSeconds(3)).ignoring(NoSuchElementException.class)
					.until(new Function<>() {
						@Override public Object apply(WebDriver t) {
							if(t.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/section/nav/div[2]/div/div/div[3]/div/div[3]/div/button")) != null) {
								t.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/section/nav/div[2]/div/div/div[3]/div/div[3]/div/button")).click();
								return true;
							}
							return false;
						}
					});
					entry.findElement(By.xpath("/html/body/div[8]/div[2]/div/div/div/div[2]/div[1]/div/div/div[2]/div/button")).click();
					Thread.sleep(1000);
					//go to directory
					Utils.extensiveness(134, 546).accept(InputEvent.BUTTON1_DOWN_MASK, rob);
					Thread.sleep(2000);
					//Double Click/file opening
					for (int g = 0; g < 2; ++g ) {;}
					Utils.extensiveness(263,256).accept(InputEvent.BUTTON1_DOWN_MASK, rob);
					Utils.extensiveness(263,256).accept(InputEvent.BUTTON1_DOWN_MASK, rob);
					Thread.sleep(1000);
					for (int i = 0; i < 2; ++i) { entry.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div/div[1]/div/div/div[3]/div/button")).click();}
					Utils.approximatePresence().accept(5, "/html/body/div[6]/div[2]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[1]/textarea");
					//copying contents into the system clipboard
					Toolkit.getDefaultToolkit().getSystemClipboard()
					       .setContents(new StringSelection(filterDescr(Utils.Validative._TARGET_.getValidative()).apply(_CONST_DES_[0])), null);
					entry.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[1]/textarea")).sendKeys(Keys.CONTROL + "v");
					Thread.sleep(1500);
					entry.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div/div[1]/div/div/div[3]/div/button")).click();
					new WebDriverWait(entry, Duration.ofMinutes(1)).ignoring(NoSuchElementException.class) //verifying the upload-completion
					.until(new Function<> () {
						@Override public Object apply(WebDriver t) {
							if(t.findElement(By.xpath("/html/body/div[6]/div[2]/div/div/div/div[2]/div[1]/div/div/div/h2")) != null) {
								t.navigate().back();
								return true;
							}
							return false;
						}
					});
					Files.delete(garbageCollect(Paths.get(Validative._DEL_PATH_.getValidative())));
				} catch(Exception excep) {return null;}
				
				return null;
			};
			
		}
		
		private static Consumer<WebDriver> mainImplementative(){
			return entry -> {
			     if(Utils.Validative._TARGET_.getValidative().contains(","))
			    	 //since the initial target has been accessed immediately, a redirection is deemed superfluous hence its removal
			    	 //the condition is static(redo)
			    	 while(!Stream.of(Utils.Validative._TARGET_.getValidative().split(",")).collect(Collectors.toCollection(ArrayDeque::new)).removeFirst().isEmpty()) {    
			    		 //sending keys
			    		 new WebDriverWait(entry, Duration.ofSeconds(10)).ignoreAll(List.of(TimeoutException.class, NoSuchElementException.class))
			    		      .until(new Function<>() {
			    		    	  @Override public Object apply(WebDriver t) {
			    		    	    _DRIVER_.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/section/nav/div[2]/div/div/div[2]/input")).sendKeys(Validative._TARGET_.getValidative().split(",")[0]);
			    		  			_DRIVER_.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/section/nav/div[2]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/a")).click();
								    //add secondary wait if necessary
			    		  			return true;
			    		    	 }
			    		 });
			    		 //profile
			    		 if(new WebDriverWait(entry, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("SITE"))) != null) 
			    		    List.of(entry.findElement((By) By.className("Nnq7C weEfm")).findElement(By.partialLinkText("/p/"))).forEach(act -> {
			    			 _DRIVER_.navigate().to(act.getAttribute("href"));//opening
			    			  Utils.approximatePresence().accept(3, "/html/body/div[6]/div[3]/div/article/div/div[2]/div/div/div[2]/div[1]/ul/div/li/div/div/div[2]/div[1]/span");
			    			 _CONST_DES_ = new String[] {_DRIVER_.findElement(By.xpath("/html/body/div[6]/div[3]/div/article/div/div[2]/div/div/div[2]/div[1]/ul/div/li/div/div/div[2]/div[1]/span")).getText()};
			    		     _DRIVER_.navigate().back();
			    		});
			    	 }
			};
		}
		
		
		private static Path garbageCollect(Path path) throws IOException {
			return Files.list(path).filter(act -> !Files.isDirectory(act)).max(Comparator.comparingLong(ef -> ef.toFile().lastModified())).get()
					!= null ? Files.list(path).filter(act -> !Files.isDirectory(act)).max(Comparator.comparingLong(ef -> ef.toFile().lastModified())).get()
							.getFileName() : null;
		}
		
		public static void enablement(){
			try {
				_DRIVER_.manage().window().setSize(new Dimension(1920, 1080));
				_DRIVER_.navigate().to("https://chrome.google.com/webstore/detail/adblock-%E2%80%94-best-ad-blocker/gighmmpiobklfepjocnamgkkbiglidom/related");
				_DRIVER_.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/div/div[2]/div[1]/div[4]/form/div/div/button")).click();
				//_DRIVER_.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				Thread.sleep(2000);
				if(new WebDriverWait(_DRIVER_, Duration.ofSeconds(10)).ignoreAll(List.of(NoSuchElementException.class, ElementClickInterceptedException.class, TimeoutException.class))
						.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body > div.F-ia-k.S-ph.S-pb-qa > div.h-F-f-k.F-f-k > div > div > div.e-f-o > div.h-e-f-Ra-c.e-f-oh-Md-zb-k > div"))) != null){
					_DRIVER_.findElement(By.cssSelector("body > div.F-ia-k.S-ph.S-pb-qa > div.h-F-f-k.F-f-k > div > div > div.e-f-o > div.h-e-f-Ra-c.e-f-oh-Md-zb-k > div")).click();
				}
				Thread.sleep(4000);
				//_DRIVER_.switchTo().alert().accept();
				Utils.extensiveness(_ADCOORD_[0], _ADCOORD_[1]).accept(InputEvent.BUTTON1_DOWN_MASK, new Robot());
				Thread.sleep(1000);
			} catch (Exception exe) { exe.printStackTrace();}
		}
	}

}
