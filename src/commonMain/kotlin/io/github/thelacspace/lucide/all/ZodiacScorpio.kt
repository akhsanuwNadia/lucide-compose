package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacScorpio") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,19.0)
                lineTo(10.0,5.5)
                curveTo(10.006155014038086,4.123652458190918,11.123638153076172,3.011155366897583,12.5,3.011155366897583)
                curveTo(13.876361846923828,3.011155366897583,14.993844985961914,4.123652458190918,15.0,5.5)
                lineTo(15.0,17.0)
                curveTo(15.0,18.104570388793945,15.895430564880371,19.0,17.0,19.0)
                lineTo(22.0,19.0)
                lineTo(19.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,19.0)
                lineTo(19.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,19.0)
                lineTo(5.0,5.5)
                curveTo(5.006155014038086,4.123652458190918,6.12363862991333,3.011155366897583,7.5,3.011155366897583)
                curveTo(8.876361846923828,3.011155366897583,9.993844985961914,4.123652458190918,10.0,5.5)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,5.5)
                curveTo(5.0,4.119287967681885,3.880711793899536,3.0,2.5,3.0)
            }
}

public val LucideIcons.All.ZodiacScorpioDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacScorpio: ImageVector
    @Composable get() = ZodiacScorpioDefinition.asImageVector()
