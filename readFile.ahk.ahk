	#NoEnv  ; Recommended for performance and compatibility with future AutoHotkey releases.
; #Warn  ; Enable warnings to assist with detecting common errors.
SendMode Input  ; Recommended for new scripts due to its superior speed and reliability.
SetWorkingDir %A_ScriptDir%  ; Ensures a consistent starting directory.


9::
Loop,

{
FileReadLine, x, C:\Users\jgkye\Documents\NetBeansProjects\NoCR\hurt.txt, 1
If (x = 1) {
SoundPlay, C:\Users\jgkye\Documents\NetBeansProjects\NoCR\Sounds\beep.wav ;
Sleep 500
}
}

8::exitapp	

