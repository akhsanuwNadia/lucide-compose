package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListRestart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0,5.0)
                lineTo(3.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,12.0)
                lineTo(3.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,19.0)
                lineTo(3.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,18.0)
                curveTo(13.291291236877441,19.721721649169922,15.539427757263184,20.423986434936523,17.581138610839844,19.74341583251953)
                curveTo(19.62285041809082,19.062847137451172,21.0,17.152151107788086,21.0,15.0)
                curveTo(21.0,12.514719009399414,18.985280990600586,10.5,16.5,10.5)
                curveTo(15.170000076293945,10.5,13.960000038146973,11.039999961853027,13.09000015258789,11.90999984741211)
                lineTo(11.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,10.0)
                lineTo(11.0,14.0)
                lineTo(15.0,14.0)
            }
}

public val LucideIcons.All.ListRestartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListRestart: ImageVector
    @Composable get() = ListRestartDefinition.asImageVector()
