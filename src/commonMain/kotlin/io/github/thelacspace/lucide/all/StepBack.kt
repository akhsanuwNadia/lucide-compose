package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("StepBack") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.971f,4.285f)
                curveTo(14.588863f,3.914277f,15.35838f,3.9045677f,15.985402f,4.259583f)
                curveTo(16.612423f,4.6145983f,17.000008f,5.2794504f,17.0f,6.0f)
                lineTo(17.0f,18.0f)
                curveTo(17.000008f,18.720549f,16.612423f,19.385403f,15.985402f,19.740417f)
                curveTo(15.35838f,20.095432f,14.588863f,20.085722f,13.971f,19.715f)
                lineTo(3.974f,13.717f)
                curveTo(3.3703134f,13.356315f,3.0004132f,12.705079f,2.9997985f,12.00185f)
                curveTo(2.9991837f,11.298621f,3.3679447f,10.64674f,3.971f,10.285f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,20.0f)
                lineTo(21.0f,4.0f)
            }
}

public val LucideIcons.All.StepBackDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.StepBack: ImageVector
    @Composable get() = StepBackDefinition.asImageVector()
