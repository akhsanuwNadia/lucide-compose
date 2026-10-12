package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ImageUpscale") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,21.0)
                lineTo(19.0,21.0)
                curveTo(20.104570388793945,21.0,21.0,20.104570388793945,21.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,12.0)
                lineTo(21.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,3.0)
                lineTo(16.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,7.0)
                lineTo(3.0,5.0)
                curveTo(3.0,3.895430564880371,3.895430564880371,3.0,5.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,21.0)
                lineTo(9.144000053405762,16.855998992919922)
                curveTo(9.370951652526855,16.628835678100586,9.6788911819458,16.501197814941406,10.0,16.501197814941406)
                curveTo(10.3211088180542,16.501197814941406,10.629048347473145,16.628835678100586,10.855999946594238,16.855998992919922)
                lineTo(13.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,3.0)
                lineTo(12.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,11.0)
                lineTo(12.0,11.0)
                lineTo(13.0,11.0)
                lineTo(13.0,21.0)
                lineTo(12.0,21.0)
                lineTo(4.0,21.0)
                lineTo(3.0,21.0)
                lineTo(3.0,11.0)
                lineTo(4.0,11.0)
                close()
            }
}

public val LucideIcons.All.ImageUpscaleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ImageUpscale: ImageVector
    @Composable get() = ImageUpscaleDefinition.asImageVector()
