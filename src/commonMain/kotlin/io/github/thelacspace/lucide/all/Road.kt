package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Road") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,17.0)
                lineTo(12.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,5.0)
                lineTo(12.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,9.0)
                lineTo(12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0769999027252197,18.448999404907227)
                curveTo(1.9040031433105469,19.052635192871094,2.0245492458343506,19.70247459411621,2.402536392211914,20.203903198242188)
                curveTo(2.7805237770080566,20.70532989501953,3.372063398361206,21.000125885009766,4.0,21.0)
                lineTo(20.0,21.0)
                curveTo(20.627878189086914,21.000349044799805,21.2194766998291,20.705820083618164,21.59764862060547,20.20460319519043)
                curveTo(21.975820541381836,19.703388214111328,22.09666633605957,19.05367088317871,21.923999786376953,18.450000762939453)
                lineTo(17.923999786376953,4.450000762939453)
                curveTo(17.678380966186523,3.5912790298461914,16.893157958984375,2.9995038509368896,16.0,3.0)
                lineTo(8.0,3.0)
                curveTo(7.106842517852783,2.9995036125183105,6.321618556976318,3.591278553009033,6.076000213623047,4.449999809265137)
                close()
            }
}

public val LucideIcons.All.RoadDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Road: ImageVector
    @Composable get() = RoadDefinition.asImageVector()
