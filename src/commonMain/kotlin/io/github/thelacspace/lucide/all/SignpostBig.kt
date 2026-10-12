package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SignpostBig") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,9.0f)
                lineTo(4.0f,9.0f)
                lineTo(2.0f,7.0f)
                lineTo(4.0f,5.0f)
                lineTo(10.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,5.0f)
                lineTo(20.0f,5.0f)
                lineTo(22.0f,7.0f)
                lineTo(20.0f,9.0f)
                lineTo(14.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,22.0f)
                lineTo(10.0f,4.0f)
                curveTo(9.996795f,3.283338f,10.377291f,2.6197395f,10.997409f,2.2604802f)
                curveTo(11.617528f,1.9012209f,12.382472f,1.9012209f,13.002591f,2.2604802f)
                curveTo(13.622709f,2.6197395f,14.003205f,3.283338f,14.0f,4.0f)
                lineTo(14.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,22.0f)
                lineTo(16.0f,22.0f)
            }
}

public val LucideIcons.All.SignpostBigDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SignpostBig: ImageVector
    @Composable get() = SignpostBigDefinition.asImageVector()
