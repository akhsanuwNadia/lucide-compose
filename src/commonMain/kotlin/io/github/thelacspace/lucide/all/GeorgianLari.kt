package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GeorgianLari") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.5,21.0)
                curveTo(7.553310394287109,20.999195098876953,4.282514572143555,17.939838409423828,4.018350124359131,14.001998901367188)
                curveTo(3.754185914993286,10.064159393310547,6.5870490074157715,6.595347881317139,10.498268127441406,6.067405700683594)
                curveTo(14.4094877243042,5.539463043212891,18.0606632232666,8.133049964904785,18.850000381469727,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,12.0)
                lineTo(13.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,21.0)
                lineTo(20.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,12.0)
                lineTo(9.0,3.0)
            }
}

public val LucideIcons.All.GeorgianLariDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GeorgianLari: ImageVector
    @Composable get() = GeorgianLariDefinition.asImageVector()
