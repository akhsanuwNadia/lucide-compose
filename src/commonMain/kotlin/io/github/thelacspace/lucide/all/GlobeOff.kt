package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GlobeOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.11400032043457,4.461999893188477)
                curveTo(10.652841567993164,3.576268196105957,11.285123825073242,2.7508814334869385,12.0,2.0)
                curveTo(15.304778099060059,1.9999394416809082,18.396169662475586,3.6326282024383545,20.259368896484375,6.362105369567871)
                curveTo(22.122568130493164,9.091582298278809,22.516929626464844,12.56532096862793,21.312999725341797,15.642999649047852)
            }
            lucidePath(strokeWidth) {
                moveTo(15.557000160217285,15.555999755859375)
                curveTo(14.945331573486328,17.97418975830078,13.720191955566406,20.19369888305664,12.0,22.0)
                curveTo(7.955419540405273,21.99994468688965,4.30911922454834,19.56352424621582,2.7613325119018555,15.826815605163574)
                curveTo(1.2135460376739502,12.090107917785645,2.0690770149230957,7.78897762298584,4.928999900817871,4.928999900817871)
            }
            lucidePath(strokeWidth) {
                moveTo(15.892000198364258,10.234000205993652)
                curveTo(15.512675285339355,7.142563819885254,14.148000717163086,4.255429267883301,12.0,2.0)
                curveTo(10.753461837768555,1.9999415874481201,9.517901420593262,2.2329447269439697,8.357000350952148,2.687000036239624)
            }
            lucidePath(strokeWidth) {
                moveTo(17.6560001373291,12.0)
                lineTo(22.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.070999145507812,19.070999145507812)
                curveTo(17.195663452148438,20.94637107849121,14.652151107788086,21.999963760375977,12.0,22.0)
                curveTo(8.565302848815918,18.394302368164062,7.22117805480957,13.2783203125,8.4399995803833,8.449999809265137)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                lineTo(12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
}

public val LucideIcons.All.GlobeOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GlobeOff: ImageVector
    @Composable get() = GlobeOffDefinition.asImageVector()
