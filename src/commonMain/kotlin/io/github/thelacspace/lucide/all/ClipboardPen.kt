package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClipboardPen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,4.0)
                lineTo(18.0,4.0)
                curveTo(19.104570388793945,4.0,20.0,4.895430564880371,20.0,6.0)
                lineTo(20.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.34000015258789,15.663999557495117)
                curveTo(21.8806209564209,15.128193855285645,22.093231201171875,14.34407901763916,21.89732551574707,13.608566284179688)
                curveTo(21.701419830322266,12.873053550720215,21.1269474029541,12.298580169677734,20.391433715820312,12.10267448425293)
                curveTo(19.655920028686523,11.906769752502441,18.871807098388672,12.119379997253418,18.336000442504883,12.65999984741211)
                lineTo(13.326000213623047,17.672000885009766)
                curveTo(13.088247299194336,17.909622192382812,12.914220809936523,18.20333480834961,12.820000648498535,18.5260009765625)
                lineTo(11.983000755310059,21.395999908447266)
                curveTo(11.93188190460205,21.571264266967773,11.980352401733398,21.76045799255371,12.10944652557373,21.88955307006836)
                curveTo(12.238541603088379,22.018648147583008,12.427735328674316,22.067119598388672,12.60300064086914,22.016000747680664)
                lineTo(15.473000526428223,21.179000854492188)
                curveTo(15.795665740966797,21.084779739379883,16.089378356933594,20.91075325012207,16.32699966430664,20.67300033569336)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,22.0)
                lineTo(6.0,22.0)
                curveTo(4.895430564880371,22.0,4.0,21.104570388793945,4.0,20.0)
                lineTo(4.0,6.0)
                curveTo(4.0,4.895430564880371,4.895430564880371,4.0,6.0,4.0)
                lineTo(8.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,2.0)
                lineTo(15.0,2.0)
                lineTo(16.0,2.0)
                lineTo(16.0,6.0)
                lineTo(15.0,6.0)
                lineTo(9.0,6.0)
                lineTo(8.0,6.0)
                lineTo(8.0,2.0)
                lineTo(9.0,2.0)
                close()
            }
}

public val LucideIcons.All.ClipboardPenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClipboardPen: ImageVector
    @Composable get() = ClipboardPenDefinition.asImageVector()
