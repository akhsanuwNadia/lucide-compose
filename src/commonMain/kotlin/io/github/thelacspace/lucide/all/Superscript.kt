package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Superscript") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,19.0)
                lineTo(12.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,19.0)
                lineTo(4.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,12.0)
                lineTo(16.0,12.0)
                curveTo(16.0,10.5,16.441999435424805,10.0,17.5,9.5)
                curveTo(18.558000564575195,9.0,20.0,8.333999633789062,20.0,7.001999855041504)
                curveTo(20.0,6.529999732971191,19.829999923706055,6.072000026702881,19.516000747680664,5.711999893188477)
                curveTo(18.856555938720703,4.966046333312988,17.76466941833496,4.784134387969971,16.89900016784668,5.276000022888184)
                curveTo(16.479000091552734,5.514999866485596,16.160999298095703,5.889999866485596,16.0,6.335999965667725)
            }
}

public val LucideIcons.All.SuperscriptDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Superscript: ImageVector
    @Composable get() = SuperscriptDefinition.asImageVector()
