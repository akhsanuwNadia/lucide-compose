package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MapPinXInside") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0f,10.0f)
                curveTo(20.0f,14.993f,14.461f,20.193f,12.601f,21.799f)
                curveTo(12.245038f,22.066668f,11.754962f,22.066668f,11.399f,21.799f)
                curveTo(9.539f,20.193f,4.0f,14.993f,4.0f,10.0f)
                curveTo(4.0196967f,5.5956874f,7.595643f,2.0356972f,12.0f,2.0356972f)
                curveTo(16.404356f,2.0356972f,19.980303f,5.5956874f,20.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.5f,7.5f)
                lineTo(9.5f,12.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.5f,7.5f)
                lineTo(14.5f,12.5f)
            }
}

public val LucideIcons.All.MapPinXInsideDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MapPinXInside: ImageVector
    @Composable get() = MapPinXInsideDefinition.asImageVector()
