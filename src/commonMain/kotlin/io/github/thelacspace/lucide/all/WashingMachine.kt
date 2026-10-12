package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WashingMachine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,6.0f)
                lineTo(6.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,6.0f)
                lineTo(17.01f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,2.0f)
                lineTo(19.0f,2.0f)
                lineTo(21.0f,2.0f)
                lineTo(21.0f,22.0f)
                lineTo(19.0f,22.0f)
                lineTo(5.0f,22.0f)
                lineTo(3.0f,22.0f)
                lineTo(3.0f,2.0f)
                lineTo(5.0f,2.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,13.0f)
                curveTo(6.991987f,14.791655f,7.943226f,16.450651f,9.493523f,17.348799f)
                curveTo(11.043819f,18.246948f,12.956181f,18.246948f,14.506477f,17.348799f)
                curveTo(16.056774f,16.450651f,17.008013f,14.791655f,17.0f,13.0f)
                curveTo(17.008013f,11.208345f,16.056774f,9.549349f,14.506477f,8.6512f)
                curveTo(12.956181f,7.753052f,11.043819f,7.753052f,9.493523f,8.6512f)
                curveTo(7.943226f,9.549349f,6.991987f,11.208345f,7.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,18.0f)
                curveTo(13.376348f,17.993845f,14.488845f,16.876362f,14.488845f,15.5f)
                curveTo(14.488845f,14.123638f,13.376348f,13.006155f,12.0f,13.0f)
                curveTo(10.623652f,12.993845f,9.511155f,11.876362f,9.511155f,10.5f)
                curveTo(9.511155f,9.123638f,10.623652f,8.006155f,12.0f,8.0f)
            }
}

public val LucideIcons.All.WashingMachineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WashingMachine: ImageVector
    @Composable get() = WashingMachineDefinition.asImageVector()
