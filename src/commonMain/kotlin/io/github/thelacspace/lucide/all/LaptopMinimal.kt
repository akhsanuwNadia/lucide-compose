package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LaptopMinimal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,4.0f)
                lineTo(19.0f,4.0f)
                curveTo(20.10457f,4.0f,21.0f,4.8954306f,21.0f,6.0f)
                lineTo(21.0f,14.0f)
                curveTo(21.0f,15.104569f,20.10457f,16.0f,19.0f,16.0f)
                lineTo(5.0f,16.0f)
                curveTo(3.8954306f,16.0f,3.0f,15.104569f,3.0f,14.0f)
                lineTo(3.0f,6.0f)
                curveTo(3.0f,4.8954306f,3.8954306f,4.0f,5.0f,4.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,20.0f)
                lineTo(22.0f,20.0f)
            }
}

public val LucideIcons.All.LaptopMinimalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LaptopMinimal: ImageVector
    @Composable get() = LaptopMinimalDefinition.asImageVector()
