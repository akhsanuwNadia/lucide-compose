package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacVirgo") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,5.5f)
                curveTo(11.006155f,4.1236525f,12.123638f,3.0111554f,13.5f,3.0111554f)
                curveTo(14.876362f,3.0111554f,15.993845f,4.1236525f,16.0f,5.5f)
                lineTo(16.0f,16.0f)
                curveTo(16.0f,18.761423f,18.238577f,21.0f,21.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,11.5f)
                curveTo(16.006155f,10.123652f,17.123638f,9.011155f,18.5f,9.011155f)
                curveTo(19.876362f,9.011155f,20.993845f,10.123652f,21.0f,11.5f)
                lineTo(21.0f,16.0f)
                curveTo(21.0f,18.761423f,18.761423f,21.0f,16.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,19.0f)
                lineTo(6.0f,6.0f)
                curveTo(6.0f,4.343146f,4.656854f,3.0f,3.0f,3.0f)
                lineTo(3.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,5.5f)
                curveTo(6.006155f,4.1236525f,7.1236386f,3.0111554f,8.5f,3.0111554f)
                curveTo(9.876362f,3.0111554f,10.993845f,4.1236525f,11.0f,5.5f)
                lineTo(11.0f,19.0f)
            }
}

public val LucideIcons.All.ZodiacVirgoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacVirgo: ImageVector
    @Composable get() = ZodiacVirgoDefinition.asImageVector()
