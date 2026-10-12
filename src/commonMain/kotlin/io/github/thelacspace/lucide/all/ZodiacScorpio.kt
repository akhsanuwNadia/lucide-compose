package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacScorpio") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,19.0f)
                lineTo(10.0f,5.5f)
                curveTo(10.006155f,4.1236525f,11.123638f,3.0111554f,12.5f,3.0111554f)
                curveTo(13.876362f,3.0111554f,14.993845f,4.1236525f,15.0f,5.5f)
                lineTo(15.0f,17.0f)
                curveTo(15.0f,18.10457f,15.895431f,19.0f,17.0f,19.0f)
                lineTo(22.0f,19.0f)
                lineTo(19.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,19.0f)
                lineTo(19.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,19.0f)
                lineTo(5.0f,5.5f)
                curveTo(5.006155f,4.1236525f,6.1236386f,3.0111554f,7.5f,3.0111554f)
                curveTo(8.876362f,3.0111554f,9.993845f,4.1236525f,10.0f,5.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,5.5f)
                curveTo(5.0f,4.119288f,3.8807118f,3.0f,2.5f,3.0f)
            }
}

public val LucideIcons.All.ZodiacScorpioDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacScorpio: ImageVector
    @Composable get() = ZodiacScorpioDefinition.asImageVector()
