package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Phi") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,22.0)
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

public val LucideIcons.All.PhiDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Phi: ImageVector
    @Composable get() = PhiDefinition.asImageVector()
