package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LaptopMinimalCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,20.0)
                lineTo(22.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,10.0)
                lineTo(11.0,12.0)
                lineTo(15.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,4.0)
                lineTo(19.0,4.0)
                lineTo(21.0,4.0)
                lineTo(21.0,16.0)
                lineTo(19.0,16.0)
                lineTo(5.0,16.0)
                lineTo(3.0,16.0)
                lineTo(3.0,4.0)
                lineTo(5.0,4.0)
                close()
            }
}

public val LucideIcons.All.LaptopMinimalCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LaptopMinimalCheck: ImageVector
    @Composable get() = LaptopMinimalCheckDefinition.asImageVector()
