package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Virus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,14.991000175476074)
                lineTo(12.010000228881836,14.991000175476074)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,22.0)
                lineTo(12.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,22.0)
                lineTo(11.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,2.0)
                lineTo(11.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.989999771118164,10.0)
                lineTo(14.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5,19.79400062561035)
                lineTo(15.5,18.06100082397461)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5,4.204999923706055)
                lineTo(15.5,5.936999797821045)
            }
            lucidePath(strokeWidth) {
                moveTo(19.79400062561035,16.5)
                lineTo(18.062000274658203,15.5)
            }
            lucidePath(strokeWidth) {
                moveTo(19.79400062561035,7.5)
                lineTo(18.062000274658203,8.5)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                lineTo(5.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,13.0)
                lineTo(2.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,12.0)
                lineTo(19.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,13.0)
                lineTo(22.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.205999851226807,16.5)
                lineTo(5.937999725341797,15.5)
            }
            lucidePath(strokeWidth) {
                moveTo(4.205999851226807,7.5)
                lineTo(5.937999725341797,8.5)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5,19.79400062561035)
                lineTo(8.5,18.06100082397461)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5,4.204999923706055)
                lineTo(8.5,5.936999797821045)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,12.0)
                lineTo(9.010000228881836,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,12.0)
                curveTo(4.9887824058532715,14.508316993713379,6.320516109466553,16.83091163635254,8.490931510925293,18.088319778442383)
                curveTo(10.661347389221191,19.345726013183594,13.338652610778809,19.345726013183594,15.509068489074707,18.088319778442383)
                curveTo(17.67948341369629,16.83091163635254,19.01121711730957,14.508316993713379,19.0,12.0)
                curveTo(19.01121711730957,9.491683006286621,17.67948341369629,7.169088363647461,15.509068489074707,5.911680698394775)
                curveTo(13.338652610778809,4.65427303314209,10.661347389221191,4.65427303314209,8.490931510925293,5.911680698394775)
                curveTo(6.320516109466553,7.169088363647461,4.9887824058532715,9.491683006286621,5.0,12.0)
            }
}

public val LucideIcons.All.VirusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Virus: ImageVector
    @Composable get() = VirusDefinition.asImageVector()
