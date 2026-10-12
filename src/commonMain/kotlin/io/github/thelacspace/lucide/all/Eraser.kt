package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Eraser") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0,21.0)
                lineTo(8.0,21.0)
                curveTo(7.467387676239014,21.001216888427734,6.956289768218994,20.789939880371094,6.579999923706055,20.413000106811523)
                lineTo(2.5859999656677246,16.413999557495117)
                curveTo(1.8052361011505127,15.632999420166016,1.8052361011505127,14.366999626159668,2.5859999656677246,13.585999488830566)
                lineTo(12.586000442504883,3.5859994888305664)
                curveTo(12.96109676361084,3.2107512950897217,13.469926834106445,2.9999263286590576,14.000500679016113,2.9999263286590576)
                curveTo(14.531074523925781,2.9999263286590576,15.039904594421387,3.2107512950897217,15.415000915527344,3.5859994888305664)
                lineTo(21.41400146484375,9.585999488830566)
                curveTo(22.194765090942383,10.366999626159668,22.194765090942383,11.632999420166016,21.41400146484375,12.413999557495117)
                lineTo(12.833999633789062,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.081999778747559,11.09000015258789)
                lineTo(13.90999984741211,19.917999267578125)
            }
}

public val LucideIcons.All.EraserDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Eraser: ImageVector
    @Composable get() = EraserDefinition.asImageVector()
