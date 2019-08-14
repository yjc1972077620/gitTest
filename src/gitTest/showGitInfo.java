package gitTest;

public class showGitInfo {
	
	public static void main(String[] args) {
		Git git=new Git();
		git.setGitName("yjc");
		git.setGitPwd("123");
		System.out.println("name:"+git.getGitName()+"\n"+"pwd:"+git.getGitPwd());
	}
}
