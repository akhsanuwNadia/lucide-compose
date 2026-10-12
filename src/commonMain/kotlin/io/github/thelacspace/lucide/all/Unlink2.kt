package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Unlink2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,7.0)
                lineTo(17.0,7.0)
                curveTo(19.752695083618164,7.01231050491333,21.977689743041992,9.24727725982666,21.977689743041992,12.0)
                curveTo(21.977689743041992,14.75272274017334,19.752695083618164,16.987689971923828,17.0,17.0)
                lineTo(15.0,17.0)
                moveTo(9.0,17.0)
                lineTo(7.0,17.0)
                curveTo(4.247304439544678,16.987689971923828,2.022310733795166,14.75272274017334,2.022310733795166,12.0)
                curveTo(2.022310733795166,9.24727725982666,4.247304439544678,7.01231050491333,7.0,7.0)
                lineTo(9.0,7.0)
            }
}

public val LucideIcons.All.Unlink2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Unlink2: ImageVector
    @Composable get() = Unlink2Definition.asImageVector()
