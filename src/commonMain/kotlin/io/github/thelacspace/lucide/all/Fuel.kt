package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Fuel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,13.0f)
                lineTo(16.0f,13.0f)
                curveTo(17.10457f,13.0f,18.0f,13.895431f,18.0f,15.0f)
                lineTo(18.0f,17.0f)
                curveTo(18.004925f,18.101078f,18.89891f,18.991076f,20.0f,18.991076f)
                curveTo(21.10109f,18.991076f,21.995075f,18.101078f,22.0f,17.0f)
                lineTo(22.0f,10.002f)
                curveTo(22.000422f,9.468955f,21.78804f,8.957796f,21.41f,8.582f)
                lineTo(18.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,21.0f)
                lineTo(14.0f,5.0f)
                curveTo(14.0f,3.8954306f,13.104569f,3.0f,12.0f,3.0f)
                lineTo(5.0f,3.0f)
                curveTo(3.8954306f,3.0f,3.0f,3.8954306f,3.0f,5.0f)
                lineTo(3.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,21.0f)
                lineTo(15.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,9.0f)
                lineTo(14.0f,9.0f)
            }
}

public val LucideIcons.All.FuelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Fuel: ImageVector
    @Composable get() = FuelDefinition.asImageVector()
