package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MilkOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f,2.0f)
                lineTo(16.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,2.0f)
                lineTo(9.0f,3.343f)
                moveTo(15.0f,2.0f)
                lineTo(15.0f,4.789f)
                curveTo(15.00002f,5.5787888f,15.233845f,6.3508964f,15.672f,7.0080004f)
                lineTo(16.328f,7.9920006f)
                curveTo(16.766344f,8.649388f,17.000177f,9.421871f,17.0f,10.212001f)
                lineTo(17.0f,11.343f)
                moveTo(7.8f,7.8f)
                lineTo(7.6720004f,7.992f)
                curveTo(7.233656f,8.649387f,6.999823f,9.421871f,7.0f,10.212f)
                lineTo(7.0f,20.0f)
                curveTo(7.0f,21.10457f,7.8954306f,22.0f,9.0f,22.0f)
                lineTo(15.0f,22.0f)
                curveTo(16.10457f,22.0f,17.0f,21.10457f,17.0f,20.0f)
                lineTo(17.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,15.0f)
                curveTo(8.599328f,14.329983f,10.400672f,14.329983f,12.0f,15.0f)
                curveTo(13.084244f,15.454273f,14.271743f,15.604655f,15.434999f,15.435f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
}

public val LucideIcons.All.MilkOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MilkOff: ImageVector
    @Composable get() = MilkOffDefinition.asImageVector()
