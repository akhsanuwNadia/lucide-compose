package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Package2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,3.0f)
                lineTo(12.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.76f,3.0f)
                curveTo(17.520313f,2.994709f,18.217869f,3.4209926f,18.56f,4.1f)
                lineTo(20.789999f,8.579f)
                curveTo(20.92794f,8.855771f,20.999823f,9.160759f,20.999998f,9.47f)
                lineTo(20.999998f,19.0f)
                curveTo(20.999998f,20.10457f,20.104568f,21.0f,18.999998f,21.0f)
                lineTo(5.0f,21.0f)
                curveTo(3.8954306f,21.0f,3.0f,20.10457f,3.0f,19.0f)
                lineTo(3.0f,9.472f)
                curveTo(3.000021f,9.161666f,3.0722594f,8.855594f,3.211f,8.578f)
                lineTo(5.45f,4.1f)
                curveTo(5.790522f,3.4242275f,6.483282f,2.998509f,7.24f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.054f,9.013f)
                lineTo(20.946999f,9.013f)
            }
}

public val LucideIcons.All.Package2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Package2: ImageVector
    @Composable get() = Package2Definition.asImageVector()
