package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CookingPot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                lineTo(22.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,12.0f)
                lineTo(20.0f,20.0f)
                curveTo(20.0f,21.10457f,19.10457f,22.0f,18.0f,22.0f)
                lineTo(6.0f,22.0f)
                curveTo(4.8954306f,22.0f,4.0f,21.10457f,4.0f,20.0f)
                lineTo(4.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,8.0f)
                lineTo(20.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.86f,6.78f)
                lineTo(8.41f,4.9700003f)
                curveTo(8.279787f,4.4554677f,8.359435f,3.9102771f,8.631401f,3.454499f)
                curveTo(8.903367f,2.998721f,9.345346f,2.6697366f,9.86f,2.5400002f)
                lineTo(11.799999f,2.0600002f)
                curveTo(12.315912f,1.9301027f,12.862319f,2.0111113f,13.318352f,2.2851062f)
                curveTo(13.7743845f,2.559101f,14.102457f,3.0035002f,14.23f,3.5200002f)
                lineTo(14.679999f,5.32f)
            }
}

public val LucideIcons.All.CookingPotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CookingPot: ImageVector
    @Composable get() = CookingPotDefinition.asImageVector()
