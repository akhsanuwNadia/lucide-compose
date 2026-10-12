package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TestTube") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.5,2.0)
                lineTo(14.5,19.5)
                curveTo(14.5,20.899999618530273,13.399999618530273,22.0,12.0,22.0)
                curveTo(10.600000381469727,22.0,9.5,20.899999618530273,9.5,19.5)
                lineTo(9.5,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5,2.0)
                lineTo(15.5,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.5,16.0)
                lineTo(9.5,16.0)
            }
}

public val LucideIcons.All.TestTubeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TestTube: ImageVector
    @Composable get() = TestTubeDefinition.asImageVector()
