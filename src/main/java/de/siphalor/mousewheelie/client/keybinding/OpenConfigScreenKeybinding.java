package de.siphalor.mousewheelie.client.keybinding;

import de.siphalor.amecs.api.AmecsKeyBinding;
import de.siphalor.amecs.api.KeyModifiers;
import de.siphalor.amecs.api.PriorityKeyBinding;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.NoticeScreen;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;

public class OpenConfigScreenKeybinding extends AmecsKeyBinding implements PriorityKeyBinding {
	public OpenConfigScreenKeybinding(Identifier id, InputUtil.Type type, int code, String category, KeyModifiers defaultModifiers) {
		super(id, type, code, category, defaultModifiers);
	}

	@Override
	public boolean onPressedPriority() {
		MinecraftClient minecraftClient = MinecraftClient.getInstance();
		minecraftClient.openScreen(new NoticeScreen(() -> minecraftClient.openScreen(null), new TranslatableText("mousewheelie.gui.config-screen-unavailable"), new TranslatableText("mousewheelie.gui.config-screen-unavailable.note")));
		//if (minecraftClient.currentScreen == null || minecraftClient.currentScreen instanceof HandledScreen)
		//minecraftClient.openScreen(ClientCore.tweedClothBridge.buildScreen());
		return true;
	}
}
