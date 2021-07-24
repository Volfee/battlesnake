package com.volfee.battlesnake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // Http requests are handled by controller.
public class BattlesnakeApplication {
	public static void main(String[] args) {
		SpringApplication.run(BattlesnakeApplication.class, args);
	}

	@GetMapping("/")
	public Customization customization() {
		return new Customization();
	}

	@PostMapping("/start")
	public void start(@RequestBody Object game, @RequestBody int turn,
					  @RequestBody Object board, @RequestBody Object you) {}

	@PostMapping("/move")
	public Move move(@RequestBody Object game, @RequestBody int turn,
					 @RequestBody Object board, @RequestBody Object you) {
		return new Move();
	}

	@PostMapping("/end")
	public void end(@RequestBody Object game, @RequestBody int turn,
					@RequestBody Object board, @RequestBody Object you) {}

}
