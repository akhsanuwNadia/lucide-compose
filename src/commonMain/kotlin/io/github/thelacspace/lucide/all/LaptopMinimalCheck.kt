package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LaptopMinimalCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,20.0f)
                lineTo(22.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,10.0f)
                lineTo(11.0f,12.0f)
                lineTo(15.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,4.0f)
                lineTo(19.0f,4.0f)
                lineTo(21.0f,4.0f)
                lineTo(21.0f,16.0f)
                lineTo(19.0f,16.0f)
                lineTo(5.0f,16.0f)
                lineTo(3.0f,16.0f)
                lineTo(3.0f,4.0f)
                lineTo(5.0f,4.0f)
                close()
            }
}

public val LucideIcons.All.LaptopMinimalCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LaptopMinimalCheck: ImageVector
    @Composable get() = LaptopMinimalCheckDefinition.asImageVector()
